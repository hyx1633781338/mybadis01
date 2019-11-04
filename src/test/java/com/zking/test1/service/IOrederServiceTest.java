package com.zking.test1.service;

import com.zking.test1.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class IOrederServiceTest extends BaseTestCase {

    @Autowired
    private IOrderService orderService;

    private Order order;

    @Override
    public void before() {
        order = new Order();
    }

    @Test
    public void loadCaseCade() throws Exception {
        order.setOrderId(1);

        Order o = orderService.loadCaseCade(this.order);
        System.out.println(o);
        System.out.println(o.getCustomer());
    }

}