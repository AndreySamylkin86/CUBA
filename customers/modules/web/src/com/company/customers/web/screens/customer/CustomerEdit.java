package com.company.customers.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Customer;

@UiController("customers_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}