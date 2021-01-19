package com.javafun.graphql.service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.javafun.graphql.model.Actor;
import com.javafun.graphql.model.Film;
import com.javafun.graphql.repository.ActorRepository;
import com.javafun.graphql.repository.FilmRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService implements GraphQLQueryResolver {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private FilmRepository filmRepository;

    public Actor getActorById(Integer actorId) {
        Optional<Actor> actor = actorRepository.findById(actorId);
        if (actor.isPresent()) {
            return actor.get();
        }
        return null;
    }

    public List<Actor> getActorsByNameLike(String name) {
        return actorRepository.findActorsByFirstNameLike(name);
    }

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

}
