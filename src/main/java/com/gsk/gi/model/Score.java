package com.gsk.gi.model;

import javax.persistence.AttributeConverter;

public class Score implements AttributeConverter<Score, String> {

    private int homeScore;

    private int awayScore;

    public Score(int homeScore, int awayScore) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public Score() {
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public String convertToDatabaseColumn(Score score) {
        return null;
    }

    public Score convertToEntityAttribute(String s) {
        return null;
    }
}
