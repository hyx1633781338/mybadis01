package com.zking.test1.service;

import com.zking.test1.model.Customer;
import com.zking.test1.service.BaseTestCase;
import com.zking.test1.service.ICustomerService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class CustomerServiceImplTest extends BaseTestCase {

    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Before
    public void before(){
        customer = new Customer();
    }

    @Test
    public void load() throws Exception {
        customer.setCustomerId(1);
        Customer load = customerService.load(customer);
        System.out.println(load);
    }

    @Test
    public void loadCasecade() throws Exception {
        customer.setCustomerId(1);
        Customer c = customerService.loadCasecade(customer);
        System.out.println(c);
        System.out.println(c.getOrderList());
    }

}