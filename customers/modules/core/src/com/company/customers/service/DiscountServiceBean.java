package com.company.customers.service;

import com.company.customers.entity.Order;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service(DiscountService.NAME)
public class DiscountServiceBean implements DiscountService {

    @Inject
    DataManager dataManager;

    @Override
    public void discount() {

//        BigDecimal sum = dataManager.loadValue("SELECT sum(a.orderSum) FROM customers_Order  a WHERE a.customer = :customer", BigDecimal.class)
//                .parameter("customer", customer).one();


    }
}