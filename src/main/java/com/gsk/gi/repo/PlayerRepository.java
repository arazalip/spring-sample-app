package com.gsk.gi.repo;

import com.gsk.gi.model.Player;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "player", path = "player")
@CacheConfig(cacheNames = {"player"})
public interface PlayerRepository extends PagingAndSortingRepository<Player, String> {

    @Cacheable(key = "#p0")
    Player findOne(String id);

}
