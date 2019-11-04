package com.zking.test1.Test;

import com.zking.test1.model.SysPermission;
import com.zking.test1.service.BaseTestCase;
import com.zking.test1.service.ISysPermissionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ISysPermissionServiceTest extends BaseTestCase {

    @Autowired
    private ISysPermissionService permissionService;

    private SysPermission permission;

    @Override
    public void before() {
        super.before();
        permission = new SysPermission();
    }

    @Test
    public void add() throws Exception {
        permission.setPermissionName("测试");
        permission.setLevel(2);
        permission.setParentPermissionId(6l);
        permission.setAvailable(1);
        permission.setPermission("sys");
        int n = permissionService.add(permission);
        System.out.println(n);
    }

    @Test
    public void del() throws Exception {
        permission.setPermissionId(8l);
        permission.setAvailable(0);
        int n = permissionService.del(permission);
        System.out.println(n);
    }

}