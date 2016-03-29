package com.gsk.gi.model;


import javafx.geometry.Pos;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "clip_objects")
public class ClipObject extends GIEntity {


    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="clip_id")
    private Clip clip;

    public enum ClipObjectType {
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ClipObjectType type;


    public enum Shape {
    }

    @Column(name = "shape")
    @Enumerated(EnumType.STRING)
    private Shape shape;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "position")
    @Convert(converter = Position.class)
    Position position;

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

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public ClipObjectType getType() {
        return type;
    }

    public void setType(ClipObjectType type) {
        this.type = type;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
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
        return "ClipObject{ " + id +
                ", clip=" + clip +
                ", type=" + type +
                ", shape=" + shape +
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
