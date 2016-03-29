package com.gsk.gi.repo;

import com.gsk.gi.model.BatteryObject;
import com.gsk.gi.model.BatteryPlayer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "battery-player", path = "battery-player")
public interface BatteryPlayerRepository extends PagingAndSortingRepository<BatteryPlayer, String> {

}
