package com.zking.test1.service;

import com.zking.test1.model.SysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface ISysUserService {

    int doRegister(SysUser user);//用户注册

    String doLogin(SysUser user);//用户登陆

    int updatePassword(SysUser user);//所有人都可以修改自己的密码

    int doResetPassword(SysUser user);//管理员可以重置所有人的密码，密码默认值为888888

    //权限关键接口
    @Transactional(readOnly = true)
    SysUser loadByUsername(SysUser user);//根据用户名查询用户
    @Transactional(readOnly = true)
    Set<String> listPermissionsByUserName(SysUser user);//查询指定用户拥有的权限
    @Transactional(readOnly = true)
    Set<String> listRolesByUserName(SysUser user);//查询指定用户拥有的角色

}
