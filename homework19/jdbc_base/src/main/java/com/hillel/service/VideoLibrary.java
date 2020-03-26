package com.hillel.service;

import com.hillel.entity.Actors;
import com.hillel.entity.Films;

import java.util.List;

public interface VideoLibrary {
    List<Films> findFilmLastYear();
    List<Actors> selectActorsByFilm(int id);
    List<Actors> selectActorsFilmedNFilms(int id);
    List<Actors> selectActorsDirectors();
    void deleteFilmsElder(int x);
}
