package com.gsk.gi.repo;

import com.gsk.gi.model.Clip;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "clip", path = "clip")
public interface ClipRepository extends PagingAndSortingRepository<Clip, String> {

}
