package com.gsk.gi.repo;

import com.gsk.gi.model.Game;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "game", path = "game")
public interface GameRepository extends PagingAndSortingRepository<Game, String> {

}
