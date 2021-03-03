package com.company.customers.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Customer;

@UiController("customers_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}