package com.zking.test1.mapper;

import com.zking.test1.model.Borrower;

public interface BorrowerMapper {
    int deleteByPrimaryKey(Integer borrowerId);

    int insert(Borrower record);

    int insertSelective(Borrower record);

    Borrower selectByPrimaryKey(Integer borrowerId);

    int updateByPrimaryKeySelective(Borrower record);

    int updateByPrimaryKey(Borrower record);
}