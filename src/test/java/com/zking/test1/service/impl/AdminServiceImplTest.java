package com.zking.test1.service.impl;

import com.zking.test1.model.Admin;
import com.zking.test1.service.BaseTestCase;
import com.zking.test1.service.IAdminService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class AdminServiceImplTest extends BaseTestCase{
    @Autowired
    private IAdminService iAdminService;

    private Admin admin;

    @Before
    public void before(){
        admin = new Admin();
    }
    @Test
    public void selectByPrimaryKey() throws Exception {
        admin.setAdminId(1);
        Admin a=this.iAdminService.selectByPrimaryKey(admin.getAdminId());
        System.out.print(a);
    }

    @Test
    public void login() throws Exception {
        admin.setAdminNumber("admin");
        admin.setAdminPassword("888888");
        Admin a=this.iAdminService.login(admin);
        System.out.print(a);
    }

}