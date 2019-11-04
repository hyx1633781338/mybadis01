package com.zking.test1.service;

import com.zking.test1.model.SysPermission;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ISysPermissionService {

    int add(SysPermission permission);

    int del(SysPermission permission);
}
