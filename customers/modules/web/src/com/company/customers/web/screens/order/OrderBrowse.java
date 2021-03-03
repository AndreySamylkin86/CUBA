package com.company.customers.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Order;

@UiController("customers_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}