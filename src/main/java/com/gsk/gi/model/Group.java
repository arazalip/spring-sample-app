package com.gsk.gi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group extends GIEntity{

    @Column(name = "title")
    protected String title;

    @ManyToOne
    @JoinColumn(name = "team_id")
    protected Team team;

    @ManyToMany
    @JoinTable(name="player_groups")
    protected List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
