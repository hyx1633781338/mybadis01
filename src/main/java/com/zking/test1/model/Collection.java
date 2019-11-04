package com.zking.test1.model;

import java.util.Date;

public class Collection {
    private Integer collectionId;

    private Integer collectionAdminId;

    private Integer collectionBorrowerId;

    private String collectionDescribe;

    private Date collectionDate;

    public Collection(Integer collectionId, Integer collectionAdminId, Integer collectionBorrowerId, String collectionDescribe, Date collectionDate) {
        this.collectionId = collectionId;
        this.collectionAdminId = collectionAdminId;
        this.collectionBorrowerId = collectionBorrowerId;
        this.collectionDescribe = collectionDescribe;
        this.collectionDate = collectionDate;
    }

    public Collection() {
        super();
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getCollectionAdminId() {
        return collectionAdminId;
    }

    public void setCollectionAdminId(Integer collectionAdminId) {
        this.collectionAdminId = collectionAdminId;
    }

    public Integer getCollectionBorrowerId() {
        return collectionBorrowerId;
    }

    public void setCollectionBorrowerId(Integer collectionBorrowerId) {
        this.collectionBorrowerId = collectionBorrowerId;
    }

    public String getCollectionDescribe() {
        return collectionDescribe;
    }

    public void setCollectionDescribe(String collectionDescribe) {
        this.collectionDescribe = collectionDescribe;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }
}