package com.gsk.gi.repo;

import com.gsk.gi.model.ClipObject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "clip-object", path = "clip-object")
public interface ClipObjectRepository extends PagingAndSortingRepository<ClipObject, String> {

}
