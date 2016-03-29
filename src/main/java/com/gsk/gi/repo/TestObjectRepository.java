package com.gsk.gi.repo;

import com.gsk.gi.model.Test;
import com.gsk.gi.model.TestObject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "test-object", path = "test-object")
public interface TestObjectRepository extends PagingAndSortingRepository<TestObject, String> {

}
