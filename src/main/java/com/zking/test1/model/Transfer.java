package com.zking.test1.model;

import java.util.Date;

public class Transfer {
    private Integer transferId;

    private Integer transferBorrowerId;

    private Integer transferAdminId;

    private Integer transferEnterpriseId;

    private Float transferMoney;

    private Date transferDate;

    public Transfer(Integer transferId, Integer transferBorrowerId, Integer transferAdminId, Integer transferEnterpriseId, Float transferMoney, Date transferDate) {
        this.transferId = transferId;
        this.transferBorrowerId = transferBorrowerId;
        this.transferAdminId = transferAdminId;
        this.transferEnterpriseId = transferEnterpriseId;
        this.transferMoney = transferMoney;
        this.transferDate = transferDate;
    }

    public Transfer() {
        super();
    }

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public Integer getTransferBorrowerId() {
        return transferBorrowerId;
    }

    public void setTransferBorrowerId(Integer transferBorrowerId) {
        this.transferBorrowerId = transferBorrowerId;
    }

    public Integer getTransferAdminId() {
        return transferAdminId;
    }

    public void setTransferAdminId(Integer transferAdminId) {
        this.transferAdminId = transferAdminId;
    }

    public Integer getTransferEnterpriseId() {
        return transferEnterpriseId;
    }

    public void setTransferEnterpriseId(Integer transferEnterpriseId) {
        this.transferEnterpriseId = transferEnterpriseId;
    }

    public Float getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(Float transferMoney) {
        this.transferMoney = transferMoney;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }
}