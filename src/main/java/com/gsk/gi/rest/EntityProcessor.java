package com.gsk.gi.rest;

import com.gsk.gi.model.GIEntity;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
class EntityProcessor implements ResourceProcessor<Resource<GIEntity>> {
    public Resource<GIEntity> process(Resource<GIEntity> resource) {
        resource.add(new Link("/" + resource.getContent().getId(), "id"));
        return resource;
    }
}
