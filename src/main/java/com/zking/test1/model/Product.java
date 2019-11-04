package com.zking.test1.model;

public class Product {
    private Integer productId;

    private String productName;

    private Integer productMaxMonth;

    private Integer productMinMonth;

    private Integer productMaxPeriods;

    private Integer productMinPeriods;

    private Float productMaxInterest;

    private Float productMinInterest;

    private Integer productMaxMoney;

    private Integer productMinMoney;

    private String productState;

    public Product(Integer productId, String productName, Integer productMaxMonth, Integer productMinMonth, Integer productMaxPeriods, Integer productMinPeriods, Float productMaxInterest, Float productMinInterest, Integer productMaxMoney, Integer productMinMoney, String productState) {
        this.productId = productId;
        this.productName = productName;
        this.productMaxMonth = productMaxMonth;
        this.productMinMonth = productMinMonth;
        this.productMaxPeriods = productMaxPeriods;
        this.productMinPeriods = productMinPeriods;
        this.productMaxInterest = productMaxInterest;
        this.productMinInterest = productMinInterest;
        this.productMaxMoney = productMaxMoney;
        this.productMinMoney = productMinMoney;
        this.productState = productState;
    }

    public Product() {
        super();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductMaxMonth() {
        return productMaxMonth;
    }

    public void setProductMaxMonth(Integer productMaxMonth) {
        this.productMaxMonth = productMaxMonth;
    }

    public Integer getProductMinMonth() {
        return productMinMonth;
    }

    public void setProductMinMonth(Integer productMinMonth) {
        this.productMinMonth = productMinMonth;
    }

    public Integer getProductMaxPeriods() {
        return productMaxPeriods;
    }

    public void setProductMaxPeriods(Integer productMaxPeriods) {
        this.productMaxPeriods = productMaxPeriods;
    }

    public Integer getProductMinPeriods() {
        return productMinPeriods;
    }

    public void setProductMinPeriods(Integer productMinPeriods) {
        this.productMinPeriods = productMinPeriods;
    }

    public Float getProductMaxInterest() {
        return productMaxInterest;
    }

    public void setProductMaxInterest(Float productMaxInterest) {
        this.productMaxInterest = productMaxInterest;
    }

    public Float getProductMinInterest() {
        return productMinInterest;
    }

    public void setProductMinInterest(Float productMinInterest) {
        this.productMinInterest = productMinInterest;
    }

    public Integer getProductMaxMoney() {
        return productMaxMoney;
    }

    public void setProductMaxMoney(Integer productMaxMoney) {
        this.productMaxMoney = productMaxMoney;
    }

    public Integer getProductMinMoney() {
        return productMinMoney;
    }

    public void setProductMinMoney(Integer productMinMoney) {
        this.productMinMoney = productMinMoney;
    }

    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState;
    }
}