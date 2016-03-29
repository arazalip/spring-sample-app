package com.gsk.gi.repo;

import com.gsk.gi.model.Clip;
import com.gsk.gi.model.Group;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "group", path = "group")
public interface GroupRepository extends PagingAndSortingRepository<Group, String> {

}
