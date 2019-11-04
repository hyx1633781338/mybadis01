package com.zking.test1.service;

import com.zking.test1.model.News;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class INewsServiceTest extends BaseTestCase {

    @Autowired
    private INewsService newsService;

    private News news;

    @Override
    public void before() {
        super.before();
        news = new News();
    }

    @Test
    public void loadCaseCade() throws Exception {
        news.setNewsId(1);
        news.setCid(3);

        News n =  newsService.loadCaseCade(news);
        System.out.println(n);
        System.out.println(n.getCategoryList());
    }

    @Test
    public void deGrantCategory() throws Exception {
        news.setNewsId(1);
        news.setCid(3);
        int rowCount = newsService.deGrantCategory(news);
        System.out.println(rowCount);
    }

    @Test
    public void doRevokeCategory() throws Exception {
        news.setNewsId(1);
        news.setCid(3);
        int rowCount = newsService.doRevokeCategory(news);
        System.out.println(rowCount);
    }

    @Test
    public void del() throws Exception {
        news.setNewsId(2);
        int rowCount = newsService.del(news);
        System.out.println(rowCount);
    }


}