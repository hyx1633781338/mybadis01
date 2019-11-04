package com.zking.test1.service.impl;

import com.zking.test1.mapper.SysPermissionMapper;
import com.zking.test1.model.SysPermission;
import com.zking.test1.service.ISysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysPermissionServiceImpl implements ISysPermissionService {

    @Autowired
    private SysPermissionMapper permissionMapper;

    @Override
    public int add(SysPermission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int del(SysPermission permission) {
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }
}
