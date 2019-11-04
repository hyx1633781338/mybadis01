package com.zking.test1.model;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private String adminNumber;

    private String adminPassword;

    private String salt;

    private String state;

    private Date createDate;

    public Admin(Integer adminId, String adminNumber, String adminPassword, String salt, String state, Date createDate) {
        this.adminId = adminId;
        this.adminNumber = adminNumber;
        this.adminPassword = adminPassword;
        this.salt = salt;
        this.state = state;
        this.createDate = createDate;
    }

    public Admin() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(String adminNumber) {
        this.adminNumber = adminNumber;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}