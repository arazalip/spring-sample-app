package com.gsk.gi.repo;

import com.gsk.gi.model.Screen;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "screen", path = "screen")
public interface ScreenRepository extends PagingAndSortingRepository<Screen, String> {

}
