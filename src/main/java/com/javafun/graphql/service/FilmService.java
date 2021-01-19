package com.javafun.graphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.javafun.graphql.Repository.FilmRepository;
import com.javafun.graphql.model.Actor;
import com.javafun.graphql.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService implements GraphQLResolver<Actor> {
    @Autowired
    private FilmRepository repository;

    public Film getFilm(Actor actor){
        Optional<Film> film = repository.findById(actor.getFilmId());
        if (film.isPresent()) {
            return film.get();
        }
        return null;
    }
}
