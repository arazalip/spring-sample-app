package com.gsk.gi.model;


import javax.persistence.AttributeConverter;

public class Position implements AttributeConverter<Position, String> {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String convertToDatabaseColumn(Position position) {
        return null;
    }

    public Position convertToEntityAttribute(String s) {
        return null;
    }
}
