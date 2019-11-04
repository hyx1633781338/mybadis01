package com.zking.test1.model;

public class RoleJurisdiction {
    private Integer roleId;

    private Integer jurisdictionId;

    public RoleJurisdiction(Integer roleId, Integer jurisdictionId) {
        this.roleId = roleId;
        this.jurisdictionId = jurisdictionId;
    }

    public RoleJurisdiction() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getJurisdictionId() {
        return jurisdictionId;
    }

    public void setJurisdictionId(Integer jurisdictionId) {
        this.jurisdictionId = jurisdictionId;
    }
}