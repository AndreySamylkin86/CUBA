package com.company.customers.service;

import com.company.customers.entity.Order;
import com.company.customers.entity.RegularCustomerCard;
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
    public void discount(Long orderNumber) {

        Order order = dataManager.loadValue("SELECT a FROM customers_Order  a WHERE a.orderNumber = :orderNumber", Order.class)
                .parameter("orderNumber", orderNumber).one();

        BigDecimal sum = dataManager.loadValue("SELECT sum(a.orderSum) FROM customers_Order  a WHERE a.customer = :customer", BigDecimal.class)
                .parameter("customer", order.getCustomer()).one();

        RegularCustomerCard regularCustomerCard = dataManager.loadValue("SELECT a FROM customers_RegularCustomerCard a WHERE a.customer = :customer", RegularCustomerCard.class)
                .parameter("customer", order.getCustomer()).one();
        regularCustomerCard.setCustomer(order.getCustomer());
        regularCustomerCard.setTotalOfAllOrders(sum);

        if (sum.compareTo(BigDecimal.valueOf(5000)) < 0)
            regularCustomerCard.setDiscount(0);
        if (sum.compareTo(BigDecimal.valueOf(5000)) >= 0 && sum.compareTo(BigDecimal.valueOf(10000)) < 0)
            regularCustomerCard.setDiscount(5);
        if (sum.compareTo(BigDecimal.valueOf(10000)) >= 0)
            regularCustomerCard.setDiscount(10);

        dataManager.commit(regularCustomerCard);
    }
}