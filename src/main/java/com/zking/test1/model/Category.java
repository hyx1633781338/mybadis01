package com.zking.test1.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Category {
    private Integer categoryId;

    private String categoryName;

    private List<News> newList = new ArrayList<News>();

    public Category(Integer categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category() {
        super();
    }

    public List<News> getNewList() {
        return newList;
    }

    public void setNewList(List<News> newList) {
        this.newList = newList;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}