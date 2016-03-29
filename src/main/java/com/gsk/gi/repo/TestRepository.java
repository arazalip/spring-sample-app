package com.gsk.gi.repo;

import com.gsk.gi.model.Test;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "test", path = "test")
public interface TestRepository extends PagingAndSortingRepository<Test, String> {

}
