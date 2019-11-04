package com.zking.test1.mapper;

import com.zking.test1.model.AdminRole;

public interface AdminRoleMapper {
    int insert(AdminRole record);

    int insertSelective(AdminRole record);
}