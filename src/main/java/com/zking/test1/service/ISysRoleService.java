package com.zking.test1.service;

import com.zking.test1.model.SysRole;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISysRoleService {

    int add(SysRole role);
    int del(SysRole role);

    //权限关键接口
    int doGrantRoleToUser(SysRole role);//给用户分配角色
    int doRevokeRoleFromUser(SysRole role);//从用户收回角色
    int doGrantPermissionToRole(SysRole role);//给角色分配权限
    int doRevokePermissionFromRole(SysRole role);//从角色收回权限
}
