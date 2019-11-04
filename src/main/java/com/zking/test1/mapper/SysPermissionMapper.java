package com.zking.test1.mapper;

import com.zking.test1.model.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}