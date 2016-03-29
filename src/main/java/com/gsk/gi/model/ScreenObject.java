package com.gsk.gi.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "screen_objects")
public class ScreenObject extends GIEntity {


    @Column(name = "idx")
    private Integer index;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="screen_id")
    private Screen screen;

    public enum ScreenObjectType {
        GEOMETRIC, TEXT, PROGRESS_BAR, HOTSPOT
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ScreenObjectType type;


    public enum Shape {
    }

    @Column(name = "shape")
    @Enumerated(EnumType.STRING)
    private Shape shape;


    public enum HotspotType {
        FREE_CHOICE, MULTIPLE_CHOICE, SELECTION_LIST, GRID
    }

    @Enumerated(EnumType.STRING)
    private HotspotType hotspotType;

    @Column(name = "best_target")
    @Convert(converter = Position.class)
    protected Position bestTarget;

    @ManyToOne
    @JoinColumn(name="activates_by_id")
    private ScreenObject activatesBy;

    @ManyToOne
    @JoinColumn(name="deactivates_by_id")
    private ScreenObject deactivatesBy;

    @Column(name = "screen_end")
    private Integer screenEnd;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "position")
    @Convert(converter = Position.class)
    protected Position position;

    @Column(name = "text")
    protected String text;

    @Column(name = "size")
    protected Integer size;

    @Column(name = "color")
    protected String color;

    @Column(name = "border_color")
    protected String borderColor;

    @Column(name = "text_color")
    protected String textColor;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public ScreenObjectType getType() {
        return type;
    }

    public void setType(ScreenObjectType type) {
        this.type = type;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public HotspotType getHotspotType() {
        return hotspotType;
    }

    public void setHotspotType(HotspotType hotspotType) {
        this.hotspotType = hotspotType;
    }

    public Position getBestTarget() {
        return bestTarget;
    }

    public void setBestTarget(Position bestTarget) {
        this.bestTarget = bestTarget;
    }

    public ScreenObject getActivatesBy() {
        return activatesBy;
    }

    public void setActivatesBy(ScreenObject activatesBy) {
        this.activatesBy = activatesBy;
    }

    public ScreenObject getDeactivatesBy() {
        return deactivatesBy;
    }

    public void setDeactivatesBy(ScreenObject deactivatesBy) {
        this.deactivatesBy = deactivatesBy;
    }

    public Integer getScreenEnd() {
        return screenEnd;
    }

    public void setScreenEnd(Integer screenEnd) {
        this.screenEnd = screenEnd;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    @Override
    public String toString() {
        return "ScreenObject{ " + id +
                ", index=" + index +
                ", screen=" + screen +
                ", type=" + type +
                ", shape=" + shape +
                ", hotspotType=" + hotspotType +
                ", bestTarget=" + bestTarget +
                ", activatesBy=" + activatesBy +
                ", deactivatesBy=" + deactivatesBy +
                ", screenEnd=" + screenEnd +
                ", visible=" + visible +
                ", position=" + position +
                ", text='" + text + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
