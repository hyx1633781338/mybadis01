package com.zking.test1.mapper;

import com.zking.test1.model.Jurisdiction;

public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer jurisdictionId);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer jurisdictionId);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);
}