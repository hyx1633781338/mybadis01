package com.zking.test1.service;

import com.zking.test1.model.News;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsService {
    @Transactional(readOnly = true)
    News loadCaseCade(News news);

    int deGrantCategory(News news);

    int doRevokeCategory(News news);

    int del(News news);
}
