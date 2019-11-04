package com.zking.test1.model;

import lombok.ToString;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@ToString
public class SysUser {
    private Long userId;

    private String username;

    private String password;

    private String salt;

    private Integer locked;

    private Date createDatetime;

    private Set<String> stringSet = new HashSet<String>();

    public SysUser(Long userId, String username, String password, String salt, Integer locked, Date createDatetime) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.locked = locked;
        this.createDatetime = createDatetime;
    }

    public SysUser() {
        super();
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}