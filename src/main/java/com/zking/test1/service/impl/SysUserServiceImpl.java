package com.zking.test1.service.impl;

import com.zking.test1.mapper.SysUserMapper;
import com.zking.test1.model.SysUser;
import com.zking.test1.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper userMapper;

    @Override
    public SysUser loadByUsername(SysUser user) {
        return userMapper.loadByUsername(user);
    }

    @Override
    public int doRegister(SysUser user) {
        return userMapper.insert(user);
    }

    @Override
    public String doLogin(SysUser user) {
        SysUser u = userMapper.doLogin(user);
        if (null==u) {
            return "账号或密码错误！";
        }
        if (0 != u.getLocked()) {
            return "账号冻结！";
        }
        return "登录成功";
    }

    @Override
    public int updatePassword(SysUser user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int doResetPassword(SysUser user) {
        List<SysUser> userList = userMapper.loadAll();
        for (SysUser u : userList) {
            u.setPassword(user.getPassword());
            userMapper.updateByPrimaryKeySelective(u);
        }
        return userList.size();
    }

    @Override
    public Set<String> listPermissionsByUserName(SysUser user) {
        return userMapper.listPermissionsByUserName(user);
    }

    @Override
    public Set<String> listRolesByUserName(SysUser user) {
        return userMapper.listRolesByUserName(user);
    }
}
