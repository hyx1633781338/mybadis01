package com.zking.test1.model;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private Integer staffAdminId;

    private Integer staffDepartmentId;

    private String staffName;

    private String staffPhone;

    private Date staffEntryDate;

    private String staffDescribe;

    public Staff(Integer staffId, Integer staffAdminId, Integer staffDepartmentId, String staffName, String staffPhone, Date staffEntryDate, String staffDescribe) {
        this.staffId = staffId;
        this.staffAdminId = staffAdminId;
        this.staffDepartmentId = staffDepartmentId;
        this.staffName = staffName;
        this.staffPhone = staffPhone;
        this.staffEntryDate = staffEntryDate;
        this.staffDescribe = staffDescribe;
    }

    public Staff() {
        super();
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getStaffAdminId() {
        return staffAdminId;
    }

    public void setStaffAdminId(Integer staffAdminId) {
        this.staffAdminId = staffAdminId;
    }

    public Integer getStaffDepartmentId() {
        return staffDepartmentId;
    }

    public void setStaffDepartmentId(Integer staffDepartmentId) {
        this.staffDepartmentId = staffDepartmentId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public Date getStaffEntryDate() {
        return staffEntryDate;
    }

    public void setStaffEntryDate(Date staffEntryDate) {
        this.staffEntryDate = staffEntryDate;
    }

    public String getStaffDescribe() {
        return staffDescribe;
    }

    public void setStaffDescribe(String staffDescribe) {
        this.staffDescribe = staffDescribe;
    }
}