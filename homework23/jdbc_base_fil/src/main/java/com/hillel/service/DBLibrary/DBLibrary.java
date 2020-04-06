package com.hillel.service.DBLibrary;

import com.hillel.db.DbWork;
import com.hillel.entity.Actors;
import com.hillel.entity.Films;
import com.hillel.service.VideoLibrary;

import java.util.List;

public class DBLibrary implements VideoLibrary {
    private DbWork base;

    public DBLibrary() {
        base = new DbWork();
    }

    @Override
    public List<Films> findFilmLastYear() {
        return getBase().findFilmByTwoYear();
    }

    @Override
    public List<Actors> selectActorsByFilm(int id) {
        return getBase().selectActorsByFilm(id);
    }

    @Override
    public List<Actors> selectActorsFilmedNFilms(int x) {
        return getBase().selectActorsFilmedNFilms(x);
    }

    @Override
    public List<Actors> selectActorsDirectors() {
        return getBase().selectActorsDirectors();
    }

    @Override
    public void deleteFilmsElder(int x) {
        getBase().deleteFilmsElder(x);
    }

    public DbWork getBase() {
        return base;
    }

    public void setBase(DbWork base) {
        this.base = base;
    }

}
