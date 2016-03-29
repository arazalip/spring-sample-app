package com.gsk.gi.repo;

import com.gsk.gi.model.Battery;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "battery", path = "battery")
public interface BatteryRepository extends PagingAndSortingRepository<Battery, String> {

}
