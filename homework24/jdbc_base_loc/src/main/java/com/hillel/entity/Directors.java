package com.hillel.entity;

import java.util.Date;

public class Directors extends Entity {
    private String director;
    private Date birth_date;

    public Directors(String director, Date birth_date) {
        super(director, birth_date);

    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
}
