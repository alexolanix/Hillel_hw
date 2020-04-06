package com.hillel.db;

import com.hillel.db.connect.BaseConnect;
import com.hillel.entity.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class DbWork {


    private final String SELECT_FILMS_BY_YEAR = "SELECT films_id, film_name, film_year, director_name, birth_date, description, country" +
            " FROM cinema_schema.films  " +
            "right join cinema_schema.directors on director_id = directors_id where film_year >= (current_date - interval 1 year);";
    private final String SELECT_ACTORS_BY_FILM = "SELECT film_name, actors_name, birth_date, year(film_year) FROM cinema_schema.films f\n" +
            "            right join cinema_schema.actors_films a on f.films_id = a.film_id\n" +
            "           join cinema_schema.actors q on a.actors_id = q.id_actors where f.films_id = ? ;";
    private final String SELECT_ACTORS_FILMED_X_FILMS = "SELECT * FROM cinema_schema.actors a join \n" +
            "(SELECT actors_id, count(film_id) sum from cinema_schema.actors_films group by actors_id) z\n" +
            "on a.id_actors = z.actors_id where z.sum >= ?;";
    private final String FILMS_WHERE_ACTORS_AS_DIRECTOR = "SELECT * FROM cinema_schema.actors join\n" +
            "cinema_schema.directors WHERE actors_name = director_name;";
    private final String DELETE_ELDER_FILMS = "DELETE FROM cinema_schema.films WHERE film_year < (curdate() - INTERVAL ? year);";

    private final String SELECT_USER_BY_USERNAME = "SELECT * FROM cinema_schema.user WHERE user_name = ?";

    public List<Films> findFilmByTwoYear() {

        Connection con = null;
        PreparedStatement st = null;
        List<Films> films = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(SELECT_FILMS_BY_YEAR);
            ResultSet res = st.executeQuery();
            films = new ArrayList<>();
            while (res.next()) {
                films.add(new Films(res.getInt("films_id"), res.getString("film_name"), res.getString("description"),
                        new Directors(res.getString("director_name"), res.getDate("birth_date")),
                        res.getString("country"), res.getDate("film_year")));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        return films;
    }

    public List<Actors> selectActorsByFilm(int id) {

        Connection con = null;
        PreparedStatement st = null;
        List<Actors> actors = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(SELECT_ACTORS_BY_FILM);
            st.setInt(1, id);
            ResultSet res = st.executeQuery();
            actors = new ArrayList<>();
            while (res.next()) {
                actors.add(new Actors(res.getString("actors_name"), res.getDate("birth_date")));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        return actors;
    }

    public User findUserByUsername(String user_name) {
        Connection con = null;
        PreparedStatement st = null;
        List<Actors> actors = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(SELECT_USER_BY_USERNAME);
            st.setString(1, user_name);
            ResultSet res = st.executeQuery();
            if (res.next()) {
                return createUserFromResultSet(res);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        return null;
    }

    public List<Actors> selectActorsFilmedNFilms(int id) {
        Connection con = null;
        PreparedStatement st = null;
        List<Actors> actors = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(SELECT_ACTORS_FILMED_X_FILMS);
            st.setInt(1, id);
            ResultSet res = st.executeQuery();
            actors = new ArrayList<>();
            while (res.next()) {
                actors.add(new Actors(res.getString("actors_name"), res.getDate("birth_date")));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        return actors;
    }

    public List<Actors> selectActorsDirectors() {
        Connection con = null;
        PreparedStatement st = null;
        List<Actors> actors = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(FILMS_WHERE_ACTORS_AS_DIRECTOR);
            ResultSet res = st.executeQuery();
            actors = new ArrayList<>();
            while (res.next()) {
                actors.add(new Actors(res.getString("actors_name"), res.getDate("birth_date")));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
        return actors;
    }

    public void deleteFilmsElder(int x) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = BaseConnect.getConnection();
            st = con.prepareStatement(DELETE_ELDER_FILMS);
            st.setInt(1, x);
            st.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStatement(st);
            closeConnection(con);
        }
    }


    private User createUserFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt(User.ID);
        String username = rs.getString(User.USERNAME);
        String password = rs.getString(User.PASSWORD);
        String firstName = rs.getString(User.FIRSTNAME);
        String lastName = rs.getString(User.LASTNAME);
        UserRole ur = UserRole.fromNumber(rs.getInt(User.ROLE));
        return new User(id, username, password, firstName, lastName, ur);
    }


    private void closeStatement(Statement st) {
        try {
            if (nonNull(st)) {
                st.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close statement");
        }
    }

    private void closeConnection(Connection con) {
        try {
            if (nonNull(con)) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close connection");
        }
    }


}
