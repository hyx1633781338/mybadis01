package com.zking.test1.mapper;

import com.zking.test1.model.SysUser;

import java.util.List;
import java.util.Set;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> loadAll();

    SysUser doLogin(SysUser user);

    SysUser loadByUsername(SysUser user);

    Set<String> listPermissionsByUserName(SysUser user);

    Set<String> listRolesByUserName(SysUser user);
}