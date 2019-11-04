package com.zking.test1.service;

import com.zking.test1.model.Category;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICategoryService {
    @Transactional(readOnly = true)
    Category loadCaseCade(Category category);
}
