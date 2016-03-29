package com.gsk.gi.repo;

import com.gsk.gi.model.Coach;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "coach", path = "coach")
public interface CoachRepository extends PagingAndSortingRepository<Coach, String> {

}
