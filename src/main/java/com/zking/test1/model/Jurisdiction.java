package com.zking.test1.model;

public class Jurisdiction {
    private Integer jurisdictionId;

    private String jurisdictionName;

    private Integer menu;

    private String url;

    private String state;

    public Jurisdiction(Integer jurisdictionId, String jurisdictionName, Integer menu, String url, String state) {
        this.jurisdictionId = jurisdictionId;
        this.jurisdictionName = jurisdictionName;
        this.menu = menu;
        this.url = url;
        this.state = state;
    }

    public Jurisdiction() {
        super();
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }

    public String getJurisdictionName() {
        return jurisdictionName;
    }

    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    public Integer getMenu() {
        return menu;
    }

    public void setMenu(Integer menu) {
        this.menu = menu;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}