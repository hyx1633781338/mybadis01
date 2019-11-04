package com.zking.test1.service.impl;

import com.zking.test1.mapper.NewsMapper;
import com.zking.test1.model.News;
import com.zking.test1.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News loadCaseCade(News news) {
        return newsMapper.loadCaseCade(news);
    }

    @Override
    public int deGrantCategory(News news) {
        return newsMapper.deGrantCategory(news);
    }

    @Override
    public int doRevokeCategory(News news) {
        return newsMapper.doRevokeCategory(news);
    }

    @Override
    public int del(News news) {
        newsMapper.deleteCasecadeByNewsId(news);
        return newsMapper.deleteByPrimaryKey(news.getNewsId());
    }
}
