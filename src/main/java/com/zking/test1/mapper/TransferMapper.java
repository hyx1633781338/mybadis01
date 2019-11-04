package com.zking.test1.mapper;

import com.zking.test1.model.Transfer;

public interface TransferMapper {
    int deleteByPrimaryKey(Integer transferId);

    int insert(Transfer record);

    int insertSelective(Transfer record);

    Transfer selectByPrimaryKey(Integer transferId);

    int updateByPrimaryKeySelective(Transfer record);

    int updateByPrimaryKey(Transfer record);
}