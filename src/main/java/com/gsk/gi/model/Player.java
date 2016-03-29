package com.gsk.gi.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "players")
@PrimaryKeyJoinColumn(name = "username", referencedColumnName = "username")
public class Player extends User {

    @JoinColumn(name = "team_id")
    @ManyToOne(cascade=CascadeType.PERSIST)
    protected Team team;

    @ManyToMany(mappedBy="players")
    protected List<Group> groups;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", team=" + team +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
