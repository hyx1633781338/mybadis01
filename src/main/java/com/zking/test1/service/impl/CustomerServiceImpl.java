package com.zking.test1.service.impl;

import com.zking.test1.mapper.CustomerMapper;
import com.zking.test1.model.Customer;
import com.zking.test1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer load(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public Customer loadCasecade(Customer customer) {
        return customerMapper.loadCasecade(customer);
    }
}
