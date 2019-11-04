package com.zking.test1.mapper;

import com.zking.test1.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);

    int deleteCasecadeByNewsId(News record);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    News loadCaseCade(News news);

    int deGrantCategory(News news);

    int doRevokeCategory(News news);
}