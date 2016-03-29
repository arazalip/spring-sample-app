package com.gsk.gi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "games")
public class Game extends GIEntity {

    @Column(name = "title")
    private String title;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    @Column(name = "datafile_addr")
    private String dataFileAddr;

    @Column(name = "metadata_addr")
    protected String metaDataAddr;

    @JoinColumn(name = "home_team_id")
    @OneToOne
    protected Team homeTeam;

    @JoinColumn(name = "away_team_id")
    @OneToOne
    protected Team awayTeam;

    @Column(name = "neutral_ground")
    protected Boolean nuteralGround;

    @Column(name = "match_start_time")
    protected Date matchStartTime;

    @Column(name = "match_duration")
    protected Long matchDuration;

    @Column(name = "scores")
    @Convert(converter = Score.class)
    protected Score scores;

    @Column(name = "stadium")
    protected String stadium;

    @Column(name = "city")
    protected String city;

    @Column(name = "country")
    protected String country;

    @Column(name = "pitch_size")
    @Convert(converter = Position.class)
    protected Position pitchSize;

    @Column(name = "framerate")
    protected Integer framerate;

    public Game() {}

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

    public String getDataFileAddr() {
        return dataFileAddr;
    }

    public void setDataFileAddr(String dataFileAddr) {
        this.dataFileAddr = dataFileAddr;
    }

    public String getMetaDataAddr() {
        return metaDataAddr;
    }

    public void setMetaDataAddr(String metaDataAddr) {
        this.metaDataAddr = metaDataAddr;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Boolean getNuteralGround() {
        return nuteralGround;
    }

    public void setNuteralGround(Boolean nuteralGround) {
        this.nuteralGround = nuteralGround;
    }

    public Score getScores() {
        return scores;
    }

    public void setScores(Score scores) {
        this.scores = scores;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
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

    public Position getPitchSize() {
        return pitchSize;
    }

    public void setPitchSize(Position pitchSize) {
        this.pitchSize = pitchSize;
    }

    public Integer getFramerate() {
        return framerate;
    }

    public void setFramerate(Integer framerate) {
        this.framerate = framerate;
    }

    public Date getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(Date matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public Long getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(Long matchDuration) {
        this.matchDuration = matchDuration;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", team=" + team +
                ", dataFileAddr='" + dataFileAddr + '\'' +
                ", metaDataAddr='" + metaDataAddr + '\'' +
                ", homeTeam=" + homeTeam +
                ", awayTeam=" + awayTeam +
                ", nuteralGround=" + nuteralGround +
                ", matchStartTime=" + matchStartTime +
                ", matchDuration=" + matchDuration +
                ", scores=" + scores +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", pitchSize=" + pitchSize +
                ", framerate=" + framerate +
                '}';
    }
}

