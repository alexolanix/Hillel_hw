package com.hillel.entity;

import java.util.Date;
import java.util.List;

public class Actors extends Entity {
    private List<Films> films;
    private String actors_name;
    private Date birth_date;


    public Actors(String actors_name, Date birth_date) {
        super(actors_name, birth_date);
    }


    public String getActors_name() {
        return actors_name;
    }

    public void setActors_name(String actors_name) {
        this.actors_name = actors_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
}
