package com.zking.test1.model;

public class AccountRole {
    private Integer accountId;

    private Integer roleId;

    public AccountRole(Integer accountId, Integer roleId) {
        this.accountId = accountId;
        this.roleId = roleId;
    }

    public AccountRole() {
        super();
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}