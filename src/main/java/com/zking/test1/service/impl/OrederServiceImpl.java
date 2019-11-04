package com.zking.test1.service.impl;

import com.zking.test1.mapper.OrderMapper;
import com.zking.test1.model.Order;
import com.zking.test1.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrederServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order loadCaseCade(Order order) {
        return orderMapper.loadCaseCade(order);
    }
}
