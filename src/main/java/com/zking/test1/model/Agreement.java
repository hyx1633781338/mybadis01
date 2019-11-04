package com.zking.test1.model;

import java.util.Date;

public class Agreement {
    private Integer agreementId;

    private Integer agreementAccountId;

    private Integer agreementProductId;

    private String agreementAdminId;

    private Integer agreementMoney;

    private Integer agreementPeriods;

    private Integer agreementDate;

    private String repaymentDate;

    private Float agreementInterest;

    private Float overdueInterest;

    private Float periodsMoney;

    private Float repaymentMoney;

    private Date agreementCreateDate;

    public Agreement(Integer agreementId, Integer agreementAccountId, Integer agreementProductId, String agreementAdminId, Integer agreementMoney, Integer agreementPeriods, Integer agreementDate, String repaymentDate, Float agreementInterest, Float overdueInterest, Float periodsMoney, Float repaymentMoney, Date agreementCreateDate) {
        this.agreementId = agreementId;
        this.agreementAccountId = agreementAccountId;
        this.agreementProductId = agreementProductId;
        this.agreementAdminId = agreementAdminId;
        this.agreementMoney = agreementMoney;
        this.agreementPeriods = agreementPeriods;
        this.agreementDate = agreementDate;
        this.repaymentDate = repaymentDate;
        this.agreementInterest = agreementInterest;
        this.overdueInterest = overdueInterest;
        this.periodsMoney = periodsMoney;
        this.repaymentMoney = repaymentMoney;
        this.agreementCreateDate = agreementCreateDate;
    }

    public Agreement() {
        super();
    }

    public Integer getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }

    public Integer getAgreementAccountId() {
        return agreementAccountId;
    }

    public void setAgreementAccountId(Integer agreementAccountId) {
        this.agreementAccountId = agreementAccountId;
    }

    public Integer getAgreementProductId() {
        return agreementProductId;
    }

    public void setAgreementProductId(Integer agreementProductId) {
        this.agreementProductId = agreementProductId;
    }

    public String getAgreementAdminId() {
        return agreementAdminId;
    }

    public void setAgreementAdminId(String agreementAdminId) {
        this.agreementAdminId = agreementAdminId;
    }

    public Integer getAgreementMoney() {
        return agreementMoney;
    }

    public void setAgreementMoney(Integer agreementMoney) {
        this.agreementMoney = agreementMoney;
    }

    public Integer getAgreementPeriods() {
        return agreementPeriods;
    }

    public void setAgreementPeriods(Integer agreementPeriods) {
        this.agreementPeriods = agreementPeriods;
    }

    public Integer getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Integer agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Float getAgreementInterest() {
        return agreementInterest;
    }

    public void setAgreementInterest(Float agreementInterest) {
        this.agreementInterest = agreementInterest;
    }

    public Float getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Float overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Float getPeriodsMoney() {
        return periodsMoney;
    }

    public void setPeriodsMoney(Float periodsMoney) {
        this.periodsMoney = periodsMoney;
    }

    public Float getRepaymentMoney() {
        return repaymentMoney;
    }

    public void setRepaymentMoney(Float repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    public Date getAgreementCreateDate() {
        return agreementCreateDate;
    }

    public void setAgreementCreateDate(Date agreementCreateDate) {
        this.agreementCreateDate = agreementCreateDate;
    }
}