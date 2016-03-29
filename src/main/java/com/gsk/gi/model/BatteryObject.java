package com.gsk.gi.model;

import javax.persistence.*;

@Entity
@Table(name = "battery_objects")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BatteryObject extends GIEntity{

    @ManyToOne
    @JoinColumn(name = "battery_id")
    protected Battery battery;

    @ManyToOne
    @JoinColumn(name = "test_id")
    protected Test test;

    @ManyToOne
    @JoinColumn(name = "screen_id")
    protected Screen screen;

    @Column(name = "idx")
    protected Integer index;

    @Column(name = "time_interval")
    protected Long timeInterval;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
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

    public Long getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(Long timeInterval) {
        this.timeInterval = timeInterval;
    }

    @Override
    public String toString() {
        return "BatteryObject{" +
                "battery=" + battery +
                ", test=" + test +
                ", screen=" + screen +
                ", index=" + index +
                ", timeInterval=" + timeInterval +
                '}';
    }
}
