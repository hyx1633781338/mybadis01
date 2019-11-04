package com.zking.test1.Test;

import com.zking.test1.model.SysUser;
import com.zking.test1.service.BaseTestCase;
import com.zking.test1.service.ISysUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.*;

public class ISysUserServiceTest extends BaseTestCase {

    @Autowired
    private ISysUserService userService;

    private SysUser user;

    @Override
    public void before() {
        super.before();
        user = new SysUser();
    }

    //用户注册
    @Test
    public void doRegister() throws Exception {
        user.setUsername("ww");
        user.setPassword("123456");
        user.setSalt("344878");
//        user.setLocked(0);
        int n = userService.doRegister(user);
        System.out.println(n);
    }

    //用户登陆
    @Test
    public void doLogin() throws Exception {
        user.setUsername("ww");
        user.setPassword("123456");
        String d = userService.doLogin(user);
        System.out.println(d);
    }

    //所有人都可以修改自己的密码
    @Test
    public void updatePassword() throws Exception {
        user.setUserId(3l);
        user.setPassword("123");
        int n = userService.updatePassword(user);
        System.out.println(n);
    }

    //管理员可以重置所有人的密码，密码默认值为888888
    @Test
    public void doResetPassword() throws Exception {
        user.setPassword("888888");
        int n = userService.doResetPassword(user);
        System.out.println(n);
    }


    //根据用户名查询用户
    @Test
    public void loadByUsername() throws Exception {
        user.setUsername("ls");
//        System.out.println("load....");
        SysUser u = userService.loadByUsername(user);
        System.out.println(u);
    }

    //查询指定用户拥有的权限
    @Test
    public void listPermissionsByUserName() throws Exception {
        user.setUsername("ls");
//        System.out.println("listPermissionsByUserName...");
        Set<String> s = userService.listPermissionsByUserName(user);
        for (Object ss: s){
            System.out.println(ss);
        }
    }

    //查询指定用户拥有的角色
    @Test
    public void listRolesByUserName() throws Exception {
        user.setUsername("zs");
//        System.out.println("listRolesByUserName...");
        Set<String> s = userService.listRolesByUserName(user);
        for (Object ss: s){
            System.out.println(ss);
        }
    }

}