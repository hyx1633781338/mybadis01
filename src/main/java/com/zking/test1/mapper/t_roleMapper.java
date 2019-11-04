package com.zking.test1.mapper;

import com.zking.test1.model.t_role;

public interface t_roleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(t_role record);

    int insertSelective(t_role record);

    t_role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(t_role record);

    int updateByPrimaryKey(t_role record);
}