package com.gsk.gi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "coaches")
@PrimaryKeyJoinColumn(name = "username", referencedColumnName = "username")
public class Coach extends User {

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    public Coach() {}

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", team=" + team +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

