package com.gsk.gi.repo;

import com.gsk.gi.model.Background;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "background", path = "background")
public interface BackgroundRepository extends PagingAndSortingRepository<Background, String> {

}
