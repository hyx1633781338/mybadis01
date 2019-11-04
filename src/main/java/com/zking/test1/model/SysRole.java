package com.zking.test1.model;

import lombok.ToString;

@ToString
public class SysRole {
    private Long roleId;

    private String roleName;

    private Integer available;

    private String description;

    private Integer userId;

    private Integer pid;

    public SysRole(Long roleId, String roleName, Integer available, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.available = available;
        this.description = description;
    }

    public SysRole() {
        super();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}