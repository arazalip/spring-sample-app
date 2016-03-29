package com.gsk.gi.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "backgrounds")
public class Background extends GIEntity {

    @Column(name = "title")
    protected String title;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    @JoinColumn(name = "clip_id")
    @OneToOne
    protected Clip clip;

    @Column(name = "image_addr")
    protected String imageAddr;

    @Column(name = "color")
    protected String color;

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

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public String getImageAddr() {
        return imageAddr;
    }

    public void setImageAddr(String imageAddr) {
        this.imageAddr = imageAddr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Background{ " + id +
                ", title='" + title + '\'' +
                ", team=" + team +
                ", clip=" + clip +
                ", imageAddr='" + imageAddr + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
