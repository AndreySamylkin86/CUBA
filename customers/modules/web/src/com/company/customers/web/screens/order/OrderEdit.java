package com.company.customers.web.screens.order;


import com.company.customers.service.DiscountService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;

import com.haulmont.cuba.gui.components.Button;


import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Order;

import javax.inject.Inject;
import java.math.BigDecimal;


@UiController("customers_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {


    @Inject
    private DiscountService discountService;

    @Inject
    private DataManager dataManager;


    @Inject
    private TextField<Long> orderNumberField;

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {
        long orderNumber = Long.parseLong(orderNumberField.getRawValue());
        discountService.discount(orderNumber);

    }
}