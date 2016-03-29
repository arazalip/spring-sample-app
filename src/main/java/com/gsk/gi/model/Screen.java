package com.gsk.gi.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "screens")
public class Screen extends GIEntity {

    @Column(name = "title")
    protected String title;

    @JoinColumn(name = "game_id")
    @OneToOne
    protected Game game;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    @JoinColumn(name = "clip_id")
    @OneToOne
    protected Clip clip;

    @JoinColumn(name = "background_id")
    @OneToOne
    protected Background background;

    @Column(name = "duration")
    protected Long duration;

    @Column(name = "hotspot_overlap")
    protected Boolean hotspotOverlap;

    public enum HotspotPosition {
        TOP,CENTER,BOTTOM
    }

    @Column(name = "hotspot_position")
    @Enumerated(EnumType.STRING)
    private HotspotPosition hotspotPosition;

    @OneToMany(mappedBy="screen")
    protected List<ScreenObject> objects;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<ScreenObject> getObjects() {
        return objects;
    }

    public void setObjects(List<ScreenObject> objects) {
        this.objects = objects;
    }

    public Boolean getHotspotOverlap() {
        return hotspotOverlap;
    }

    public void setHotspotOverlap(Boolean hotspotOverlap) {
        this.hotspotOverlap = hotspotOverlap;
    }

    public HotspotPosition getHotspotPosition() {
        return hotspotPosition;
    }

    public void setHotspotPosition(HotspotPosition hotspotPosition) {
        this.hotspotPosition = hotspotPosition;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "title='" + title + '\'' +
                ", game=" + game +
                ", team=" + team +
                ", clip=" + clip +
                ", background=" + background +
                ", duration=" + duration +
                ", hotspotOverlap=" + hotspotOverlap +
                ", hotspotPosition=" + hotspotPosition +
                ", objects=" + objects +
                '}';
    }
}
