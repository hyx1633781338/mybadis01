package com.zking.test1.model;

public class Borrower {
    private Integer borrowerId;

    private Integer borrowerAgreementId;

    private Integer borrowerAdminId;

    private Float alreadyMoney;

    private Float notMoney;

    private Float overdueMoney;

    private String state;

    public Borrower(Integer borrowerId, Integer borrowerAgreementId, Integer borrowerAdminId, Float alreadyMoney, Float notMoney, Float overdueMoney, String state) {
        this.borrowerId = borrowerId;
        this.borrowerAgreementId = borrowerAgreementId;
        this.borrowerAdminId = borrowerAdminId;
        this.alreadyMoney = alreadyMoney;
        this.notMoney = notMoney;
        this.overdueMoney = overdueMoney;
        this.state = state;
    }

    public Borrower() {
        super();
    }

    public Integer getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Integer borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Integer getBorrowerAgreementId() {
        return borrowerAgreementId;
    }

    public void setBorrowerAgreementId(Integer borrowerAgreementId) {
        this.borrowerAgreementId = borrowerAgreementId;
    }

    public Integer getBorrowerAdminId() {
        return borrowerAdminId;
    }

    public void setBorrowerAdminId(Integer borrowerAdminId) {
        this.borrowerAdminId = borrowerAdminId;
    }

    public Float getAlreadyMoney() {
        return alreadyMoney;
    }

    public void setAlreadyMoney(Float alreadyMoney) {
        this.alreadyMoney = alreadyMoney;
    }

    public Float getNotMoney() {
        return notMoney;
    }

    public void setNotMoney(Float notMoney) {
        this.notMoney = notMoney;
    }

    public Float getOverdueMoney() {
        return overdueMoney;
    }

    public void setOverdueMoney(Float overdueMoney) {
        this.overdueMoney = overdueMoney;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}