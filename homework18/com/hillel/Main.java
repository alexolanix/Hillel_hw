package com.hillel;


import com.hillel.service.DBLibrary.DBLibrary;
import com.hillel.service.VideoLibrary;

public class Main {
    public static void main(String[] args) {
        VideoLibrary library = new DBLibrary();
        System.out.println(library.findFilmLastYear());
        System.out.println(library.selectActorsByFilm(3));
        System.out.println(library.selectActorsDirectors());
        System.out.println(library.selectActorsFilmedNFilms(2));
       // library.deleteFilmsElder(47);

    }
}
