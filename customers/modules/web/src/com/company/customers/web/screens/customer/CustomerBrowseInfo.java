package com.company.customers.web.screens.customer;

import com.company.customers.entity.RegularCustomerCard;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.DataGrid;
import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Customer;

import javax.inject.Inject;

@UiController("customers_Customer.browseInfo")
@UiDescriptor("customer-browseInfo.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowseInfo extends StandardLookup<Customer> {

    @Inject
    private Dialogs dialogs;

    @Inject
    DataManager dataManager;

    @Subscribe("customersTable")
    public void onCustomersTableItemClick(DataGrid.ItemClickEvent<Customer> event) {
        Customer customer = event.getItem();

        Long countOrders = dataManager.loadValue("SELECT count(a) FROM customers_Order a WHERE a.customer = :customer", Long.class)
                .parameter("customer", customer).one();

        RegularCustomerCard regularCustomerCard = dataManager.loadValue("SELECT a FROM customers_RegularCustomerCard a WHERE a.customer = :customer", RegularCustomerCard.class)
                .parameter("customer", customer).one();


        dialogs.createMessageDialog()
                .withCloseOnClickOutside(true)
                .withCaption("Information about " + customer.getFirstName() + " " + customer.getLastName())
                .withMessage("Total number of orders =  " + countOrders
                        + "\nTotal amount of all orders =  " + regularCustomerCard.getTotalOfAllOrders()
                        + "\nDiscount = " + regularCustomerCard.getDiscount() + "%"
                        + "\n ")
                .show();

    }
}