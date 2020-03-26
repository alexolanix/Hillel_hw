package com.hillel.entity;

import java.util.Date;

public class Entity {
    public static final String NAME = "person_name";
    public static final String DATE = "birth_date";

    private Date date;
    private String name;

    public Entity(String name, Date date) {
        this.date = date;
        this.name = name;
    }

    @Override
    public String toString() {
        return " " +
                "name: " + name + '\'' +
                ", birth_date: " + date;
    }
}
