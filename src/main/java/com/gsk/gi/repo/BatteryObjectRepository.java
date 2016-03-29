package com.gsk.gi.repo;

import com.gsk.gi.model.Battery;
import com.gsk.gi.model.BatteryObject;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "battery-object", path = "battery-object")
public interface BatteryObjectRepository extends PagingAndSortingRepository<BatteryObject, String> {

}
