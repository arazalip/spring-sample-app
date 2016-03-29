package com.gsk.gi.model;

import javax.persistence.*;

@Entity
@Table(name = "battery_players")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BatteryPlayer extends GIEntity {


    @OneToOne
    @JoinColumn(name = "player_id")
    protected Player player;

    @OneToOne
    @JoinColumn(name = "battery_id")
    protected Battery battery;

    @Column(name = "assignment_time")
    protected Long assignmentTime;
}
