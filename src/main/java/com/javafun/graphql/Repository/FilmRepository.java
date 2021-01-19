package com.javafun.graphql.Repository;

import com.javafun.graphql.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {

}
