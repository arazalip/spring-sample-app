package com.gsk.gi.repo;

import com.gsk.gi.model.Team;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepository extends PagingAndSortingRepository<Team, String> {

}
