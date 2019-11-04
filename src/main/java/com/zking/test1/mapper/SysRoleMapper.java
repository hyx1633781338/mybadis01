package com.zking.test1.mapper;

import com.zking.test1.model.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    int doGrantRoleToUser(SysRole role);//给用户分配角色

    int doRevokeRoleFromUser(SysRole role);//从用户收回角色

    int doGrantPermissionToRole(SysRole role);//给角色分配权限

    int doRevokePermissionFromRole(SysRole role);//从角色收回权限
}