package com.gsk.gi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "tests")
public class Test extends GIEntity {

    @Column(name = "title")
    private String title;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    public enum TestType{

    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    protected TestType type;

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

    public TestType getType() {
        return type;
    }

    public void setType(TestType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Test{" +
                "title='" + title + '\'' +
                ", team=" + team +
                ", type=" + type +
                '}';
    }
}
