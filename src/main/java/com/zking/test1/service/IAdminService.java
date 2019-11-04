package com.zking.test1.service;

import com.zking.test1.model.Admin;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IAdminService {
    int deleteByPrimaryKey(Integer adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    @Transactional(readOnly = true)
    Admin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    Admin login(Admin admin);
}
