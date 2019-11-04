package com.zking.test1.model;

public class t_role {
    private Integer roleId;

    private String roleName;

    private String state;

    public t_role(Integer roleId, String roleName, String state) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.state = state;
    }

    public t_role() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}