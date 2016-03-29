package com.gsk.gi.model;

import javax.persistence.*;

@Entity
@Table(name = "tags")
public class Tag{

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "value")
    private String value;

    @Column(name="entity_id")
    private String entityId;

    @Column(name = "entity_class")
    private String entityClass;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", entityId='" + entityId + '\'' +
                ", entityClass='" + entityClass + '\'' +
                '}';
    }


}
