package com.gsk.gi.model;


import com.fasterxml.jackson.annotation.JsonCreator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "teams")
public class Team extends GIEntity {

    @Column(name = "name")
    protected String name;

    @Column(name = "city")
    protected String city;

    @Column(name = "country")
    protected String country;

    @Column(name = "logo")
    protected Byte[] logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Byte[] getLogo() {
        return logo;
    }

    public void setLogo(Byte[] logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Team{ " + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", logo=" + Arrays.toString(logo) +
                '}';
    }
}
