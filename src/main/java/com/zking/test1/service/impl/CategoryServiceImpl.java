package com.zking.test1.service.impl;

import com.zking.test1.mapper.CategoryMapper;
import com.zking.test1.model.Category;
import com.zking.test1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category loadCaseCade(Category category) {
        return categoryMapper.loadCaseCade(category);
    }
}
