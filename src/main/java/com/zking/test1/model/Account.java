package com.zking.test1.model;

import java.util.Date;

public class Account {
    private Integer accountId;

    private String accountNumber;

    private String accountPassword;

    private String salt;

    private String state;

    private Date createDate;

    public Account(Integer accountId, String accountNumber, String accountPassword, String salt, String state, Date createDate) {
        this.accountId = accountId;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.salt = salt;
        this.state = state;
        this.createDate = createDate;
    }

    public Account() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
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