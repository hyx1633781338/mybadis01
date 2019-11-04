package com.zking.test1.Test;

import com.zking.test1.model.SysRole;
import com.zking.test1.service.BaseTestCase;
import com.zking.test1.service.ISysRoleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ISysRoleServiceTest extends BaseTestCase {

    @Autowired
    private ISysRoleService roleService;

    private SysRole role;

    @Override
    public void before() {
        super.before();
        role = new SysRole();
    }

    @Test
    public void add() throws Exception {
        role.setRoleName("admin2");
        role.setAvailable(1);
        role.setDescription("管理员");
        int n = roleService.add(role);
        System.out.println(n);
    }

    @Test
    public void del() throws Exception {
        role.setRoleId(3l);
        role.setAvailable(0);
        int n = roleService.del(role);
        System.out.println(n);
    }

    //给用户分配角色
    @Test
    public void doGrantRoleToUser() throws Exception {
        role.setUserId(1);
        role.setRoleId(3l);
        int n = roleService.doGrantRoleToUser(role);
        System.out.println(n);
    }

    //从用户收回角色
    @Test
    public void doRevokeRoleFromUser() throws Exception {
        role.setUserId(1);
        role.setRoleId(2l);
        int n = roleService.doRevokeRoleFromUser(role);
        System.out.println(n);
    }

    //给角色分配权限
    @Test
    public void doGrantPermissionToRole() throws Exception {
        role.setRoleId(1l);
        role.setPid(4);
        int n = roleService.doGrantPermissionToRole(role);
        System.out.println(n);
    }

    //从角色收回权限
    @Test
    public void doRevokePermissionFromRole() throws Exception {
        role.setRoleId(1l);
        role.setPid(4);
        int n = roleService.doRevokePermissionFromRole(role);
        System.out.println(n);
    }

}