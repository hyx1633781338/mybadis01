package com.zking.test1.mapper;

import com.zking.test1.model.AccountRole;

public interface AccountRoleMapper {
    int insert(AccountRole record);

    int insertSelective(AccountRole record);
}