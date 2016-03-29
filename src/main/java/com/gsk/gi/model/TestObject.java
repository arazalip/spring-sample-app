package com.gsk.gi.model;

import javax.persistence.*;

@Entity
@Table(name = "test_objects")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class TestObject extends GIEntity{

    @ManyToOne
    @JoinColumn(name = "test_id")
    protected Test test;

    @ManyToOne
    @JoinColumn(name = "clip_id")
    protected Clip clip;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    protected Screen screen;

    @Column(name = "idx")
    protected Integer index;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "test=" + test +
                ", clip=" + clip +
                ", screen=" + screen +
                ", index=" + index +
                '}';
    }
}
