package com.zking.test1.model;

public class Userinfo {
    private Integer userId;

    private Integer userAccountId;

    private String userName;

    private String userPhone;

    private String userIdentityCard;

    private String userBankCard;

    private Integer userReputation;

    private String userRank;

    public Userinfo(Integer userId, Integer userAccountId, String userName, String userPhone, String userIdentityCard, String userBankCard, Integer userReputation, String userRank) {
        this.userId = userId;
        this.userAccountId = userAccountId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userIdentityCard = userIdentityCard;
        this.userBankCard = userBankCard;
        this.userReputation = userReputation;
        this.userRank = userRank;
    }

    public Userinfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Integer userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIdentityCard() {
        return userIdentityCard;
    }

    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard;
    }

    public String getUserBankCard() {
        return userBankCard;
    }

    public void setUserBankCard(String userBankCard) {
        this.userBankCard = userBankCard;
    }

    public Integer getUserReputation() {
        return userReputation;
    }

    public void setUserReputation(Integer userReputation) {
        this.userReputation = userReputation;
    }

    public String getUserRank() {
        return userRank;
    }

    public void setUserRank(String userRank) {
        this.userRank = userRank;
    }
}