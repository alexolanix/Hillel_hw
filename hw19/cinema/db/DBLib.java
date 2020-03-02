package com.hillel.cinema.db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBLib {

    DBConnect con = new DBConnect();

    public void selectBy() {
        final String SELECT_FILMS_BY_YEAR = "SELECT * FROM cinema_schema.films  right join cinema_schema.directors\n" +
                "on director_id = directors_id where film_year >= (current_date - interval 1 year);";
        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
            ResultSet set = statement.executeQuery(SELECT_FILMS_BY_YEAR);
            while (set.next()) {
                String first = set.getString(1);
                String firs = set.getString(2);
                Date birth = set.getDate(7);
                System.out.println("ID: " + first + "  Movie: " + firs + "  Premiere:" + birth);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectActorsByFillm(String x) {
        System.out.println("\nActors by film: " + x);
        final String SELECT_ACTORS_BY_FILM = "SELECT film_name, group_concat(actors_name), film_year FROM cinema_schema.films f\n" +
                "right join cinema_schema.actors_films a on f.films_id = a.film_id\n" +
                "join cinema_schema.actors q on a.actors_id = q.id_actors where f.film_name = " + x + ";";

        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
            ResultSet set = statement.executeQuery(SELECT_ACTORS_BY_FILM);
            while (set.next()) {
                String first = set.getString(1);
                String firs = set.getString(2);
                Date birth = set.getDate(3);
                System.out.println("Movie: " + first + "  Actors: " + firs + "  Premiere:" + birth);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectActorsBySeveralFillm(int x) {
        System.out.println("\nFilms by actor: " + x);
        final String SELECT_ACTORS_FILMED_X_FILMS = "SELECT * FROM cinema_schema.actors a join\n" +
                "(SELECT actors_id, count(film_id) sum from cinema_schema.actors_films group by actors_id) z\n" +
                "on a.id_actors = z.actors_id where z.sum >=  " + x + "";

        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
            ResultSet set = statement.executeQuery(SELECT_ACTORS_FILMED_X_FILMS);
            while (set.next()) {
                String first = set.getString(1);
                String firs = set.getString(2);
                Date birth = set.getDate(3);
                System.out.println("Movie: " + first + "  Actors: " + firs + "  Birthday:" + birth);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void SelectActorsWhoisDirectors() {
        System.out.println("\nDirectored by actor: ");
        final String FILMS_WHERE_ACTORS_AS_DIRECTOR = "SELECT actors_name FROM cinema_schema.actors join\n" +
                "cinema_schema.directors WHERE actors_name = name;";

        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
            ResultSet set = statement.executeQuery(FILMS_WHERE_ACTORS_AS_DIRECTOR);
            while (set.next()) {
                String first = set.getString(1);
                System.out.println("Name: " + first);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }


    public void DeleteFillmElderThanXYears(int x) {
        System.out.println("\nDelete films elder years: " + x);
        final String DELETE_ELDER_FILMS = "DELETE FROM cinema_schema.films WHERE film_year < (curdate() - INTERVAL " + x + " year);";

        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
            ResultSet set = statement.executeQuery(DELETE_ELDER_FILMS);
            while (set.next()) {
                String first = set.getString(1);
                String firs = set.getString(2);
                Date birth = set.getDate(3);
                System.out.println("Movie: " + first + "  Actors: " + firs + "  Birthday:" + birth);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
