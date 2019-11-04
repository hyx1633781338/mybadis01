package com.zking.test1.service;

import com.zking.test1.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {

    @Transactional(readOnly = true)
    Order loadCaseCade(Order order);
}
