package com.company.customers.web.screens.order;

import com.company.customers.entity.Customer;
import com.company.customers.entity.RegularCustomerCard;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Dialogs;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.Order;

import javax.inject.Inject;

@UiController("customers_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {









    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {



    }


}