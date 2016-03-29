package com.gsk.gi.repo;

import com.gsk.gi.model.ScreenObject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "screen-object", path = "screen-object")
public interface ScreenObjectRepository extends PagingAndSortingRepository<ScreenObject, String> {

}
