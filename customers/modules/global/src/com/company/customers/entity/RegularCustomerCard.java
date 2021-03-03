package com.company.customers.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "CUSTOMERS_REGULAR_CUSTOMER_CARD")
@Entity(name = "customers_RegularCustomerCard")
@NamePattern("%s|discount")
public class RegularCustomerCard extends StandardEntity {
    private static final long serialVersionUID = -1490698544083242836L;

    @Column(name = "DISCOUNT")
    private Integer discount;

    @Column(name = "TOTAL_OF_ALL_ORDERS")
    private BigDecimal totalOfAllOrders;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CUSTOMER_ID", unique = true)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getTotalOfAllOrders() {
        return totalOfAllOrders;
    }

    public void setTotalOfAllOrders(BigDecimal totalOfAllOrders) {
        this.totalOfAllOrders = totalOfAllOrders;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}