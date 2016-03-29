package com.gsk.gi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "batteries")
public class Battery extends GIEntity {

    @Column(name = "title")
    private String title;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}
