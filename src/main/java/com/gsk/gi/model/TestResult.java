package com.gsk.gi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResult {

    private String id;

    private String title;

    private String teamId;

    private String batteryId;

    private String clipId;

    private String screenId;

    private String testId;

    private String testType;

    private String testPart;

    private String result;

    private Long responseTime;

    private String ip;

    private String location;

    private String playerId;

    private String playerFirstName;

    private String playerLastName;

    private Integer playerAge;

    private String playerSex;

    private Integer playerHeight;

    private Integer playerWeight;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(String batteryId) {
        this.batteryId = batteryId;
    }

    public String getClipId() {
        return clipId;
    }

    public void setClipId(String clipId) {
        this.clipId = clipId;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestPart() {
        return testPart;
    }

    public void setTestPart(String testPart) {
        this.testPart = testPart;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public Integer getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    public String getPlayerSex() {
        return playerSex;
    }

    public void setPlayerSex(String playerSex) {
        this.playerSex = playerSex;
    }

    public Integer getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(Integer playerHeight) {
        this.playerHeight = playerHeight;
    }

    public Integer getPlayerWeight() {
        return playerWeight;
    }

    public void setPlayerWeight(Integer playerWeight) {
        this.playerWeight = playerWeight;
    }
}
