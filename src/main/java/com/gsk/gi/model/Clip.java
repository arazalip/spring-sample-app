package com.gsk.gi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "clips")
public class Clip extends GIEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "datafile_addr")
    private String dataFileAddr;

    @Column(name = "metadata_addr")
    protected String metaDataAddr;

    @JoinColumn(name = "team_id")
    @OneToOne
    protected Team team;

    @Column(name = "thumbnail_addr")
    protected String thumbnailAddr;

    @Column(name = "extraction_time")
    protected Long extraction_time;

    @Column(name = "start_point")
    protected Long beginPoint;

    @Column(name = "end_point")
    protected Long engdPoint;

    @Column(name = "duration")
    protected Long duration;

    @OneToMany(mappedBy="clip")
    protected List<ClipObject> objects;

    public Clip() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getThumbnailAddr() {
        return thumbnailAddr;
    }

    public void setThumbnailAddr(String thumbnailAddr) {
        this.thumbnailAddr = thumbnailAddr;
    }

    public Long getExtraction_time() {
        return extraction_time;
    }

    public void setExtraction_time(Long extraction_time) {
        this.extraction_time = extraction_time;
    }

    public Long getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(Long beginPoint) {
        this.beginPoint = beginPoint;
    }

    public Long getEngdPoint() {
        return engdPoint;
    }

    public void setEngdPoint(Long engdPoint) {
        this.engdPoint = engdPoint;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<ClipObject> getObjects() {
        return objects;
    }

    public void setObjects(List<ClipObject> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Clip{ " + id +
                ", title='" + title + '\'' +
                ", dataFileAddr='" + dataFileAddr + '\'' +
                ", metaDataAddr='" + metaDataAddr + '\'' +
                ", team=" + team +
                ", thumbnailAddr='" + thumbnailAddr + '\'' +
                ", extraction_time=" + extraction_time +
                ", beginPoint=" + beginPoint +
                ", engdPoint=" + engdPoint +
                ", duration=" + duration +
                '}';
    }

}

