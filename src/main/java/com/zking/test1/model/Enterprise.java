package com.zking.test1.model;

public class Enterprise {
    private Integer enterpriseId;

    private String enterpriseName;

    private String enterpriseAddress;

    private String enterpriseLinkman;

    private String enterpriseLinkmanPhone;

    public Enterprise(Integer enterpriseId, String enterpriseName, String enterpriseAddress, String enterpriseLinkman, String enterpriseLinkmanPhone) {
        this.enterpriseId = enterpriseId;
        this.enterpriseName = enterpriseName;
        this.enterpriseAddress = enterpriseAddress;
        this.enterpriseLinkman = enterpriseLinkman;
        this.enterpriseLinkmanPhone = enterpriseLinkmanPhone;
    }

    public Enterprise() {
        super();
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseLinkman() {
        return enterpriseLinkman;
    }

    public void setEnterpriseLinkman(String enterpriseLinkman) {
        this.enterpriseLinkman = enterpriseLinkman;
    }

    public String getEnterpriseLinkmanPhone() {
        return enterpriseLinkmanPhone;
    }

    public void setEnterpriseLinkmanPhone(String enterpriseLinkmanPhone) {
        this.enterpriseLinkmanPhone = enterpriseLinkmanPhone;
    }
}