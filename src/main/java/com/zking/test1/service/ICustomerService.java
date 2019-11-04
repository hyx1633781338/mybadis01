package com.zking.test1.service;

import com.zking.test1.model.Customer;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerService {

    @Transactional(readOnly = true)
    Customer load(Customer customer);

    @Transactional(readOnly = true)
    Customer loadCasecade(Customer customer);
}
