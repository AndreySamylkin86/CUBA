package com.company.customers.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "CUSTOMERS_ORDER")
@Entity(name = "customers_Order")
@NamePattern("%s|orderNumber")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 6920387546757373027L;

    @NotNull
    @Column(name = "ORDER_NUMBER", nullable = false, unique = true)
    private Long orderNumber;

    @Column(name = "ORDER_SUM")
    private BigDecimal orderSum;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    public void setOrderSum(BigDecimal orderSum) {
        this.orderSum = orderSum;
    }

    public BigDecimal getOrderSum() {
        return orderSum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }


}