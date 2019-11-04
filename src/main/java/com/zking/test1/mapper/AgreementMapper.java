package com.zking.test1.mapper;

import com.zking.test1.model.Agreement;

public interface AgreementMapper {
    int deleteByPrimaryKey(Integer agreementId);

    int insert(Agreement record);

    int insertSelective(Agreement record);

    Agreement selectByPrimaryKey(Integer agreementId);

    int updateByPrimaryKeySelective(Agreement record);

    int updateByPrimaryKey(Agreement record);
}