package com.javafun.graphql.repository;

import java.util.List;

import com.javafun.graphql.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
    @Query("SELECT a FROM Actor a WHERE firstName LIKE :name")
    public List<Actor> findActorsByFirstNameLike(@Param("name") String name);
}
