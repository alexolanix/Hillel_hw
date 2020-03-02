package com.hillel.cinema;

import com.hillel.cinema.db.DBLib;

import java.sql.SQLException;

public class Maine {
    public static void main(String[] args) throws SQLException {

        DBLib lib = new DBLib();
        lib.selectBy();
        lib.selectActorsByFillm("'godfather'");
        lib.selectActorsBySeveralFillm(2);
        lib.SelectActorsWhoisDirectors();
        lib.DeleteFillmElderThanXYears(46);

    }

}
