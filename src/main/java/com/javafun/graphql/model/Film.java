package com.javafun.graphql.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "FILM")
public class Film {
    @Id
    @Column(name = "FILM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer filmId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DATE_OF_LAUNCH")
    private Date dateOfLaunch;
    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Actor> actor;

    public Film() {
    }

    public Film(String name, Date dateOfLaunch) {
        this.name = name;
        this.dateOfLaunch = dateOfLaunch;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmID(Integer filmId) {
        this.filmId = filmId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfLaunch() {
        return dateOfLaunch;
    }

    public void setDateOfLaunch(Date dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
    }
}
