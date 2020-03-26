package com.hillel.entity;

import java.util.Date;
import java.util.List;

public class Films {
    private int id;
    private String name;
    private Directors director;
    private List<Actors> actors;
    private String description;
    private String country;
    private Date year;

    public Films(int id, String name, String description, Directors director, String country, Date year) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.director = director;
        this.country = country;
        this.year = year;
    }


    public Films(int films_id, String name, Directors director, Date year) {
        this.id = films_id;
        this.director = director;
        this.name = name;
        this.year = year;

    }

    public Films(String film_name, Directors director, Date film_year) {

        this.name = film_name;
        this.director = director;
        this.year = film_year;
    }

    @Override
    public String toString() {
        return "\nFilm: " + id +
                " '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", \n Director: " + director + ",\n " +
                "country: '" + country + '\'' +
                ", Premiere: " + year;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directors getDirector() {
        return director;
    }

    public List<Actors> getActors() {
        return actors;
    }

    public void setActors(List<Actors> actors) {
        this.actors = actors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }
}

