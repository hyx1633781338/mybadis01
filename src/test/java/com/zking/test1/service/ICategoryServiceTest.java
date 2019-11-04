package com.zking.test1.service;

import com.zking.test1.model.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ICategoryServiceTest extends BaseTestCase {

    @Autowired
    private ICategoryService categoryService;

    private Category category;

    @Override
    public void before() {
        super.before();
        category = new Category();
    }

    @Test
    public void loadCaseCade(){
        category.setCategoryId(1);
        Category c = categoryService.loadCaseCade(category);
        System.out.println(c);
        System.out.println(c.getNewList());
    }
}