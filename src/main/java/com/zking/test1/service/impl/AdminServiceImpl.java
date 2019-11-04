package com.zking.test1.service.impl;

import com.zking.test1.mapper.AdminMapper;
import com.zking.test1.model.Admin;
import com.zking.test1.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;
    public AdminServiceImpl (){

    }

    @Override
    public int deleteByPrimaryKey(Integer adminId) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public Admin selectByPrimaryKey(Integer adminId) {
        return adminMapper.selectByPrimaryKey(adminId);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

    @Override
    public Admin login(Admin admin) {
        return adminMapper.login(admin);
    }
}
