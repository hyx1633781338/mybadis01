package com.zking.test1.service.impl;

import com.zking.test1.mapper.SysRoleMapper;
import com.zking.test1.model.SysRole;
import com.zking.test1.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleServiceImpl implements ISysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public int add(SysRole role) {
        return roleMapper.insert(role);
    }

    @Override
    public int del(SysRole role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int doGrantRoleToUser(SysRole role) {
        return roleMapper.doGrantRoleToUser(role);
    }

    @Override
    public int doRevokeRoleFromUser(SysRole role) {
        return roleMapper.doRevokeRoleFromUser(role);
    }

    @Override
    public int doGrantPermissionToRole(SysRole role) {
        return roleMapper.doGrantPermissionToRole(role);
    }

    @Override
    public int doRevokePermissionFromRole(SysRole role) {
        return roleMapper.doRevokePermissionFromRole(role);
    }
}
