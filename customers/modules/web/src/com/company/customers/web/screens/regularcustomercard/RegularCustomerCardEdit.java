package com.company.customers.web.screens.regularcustomercard;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.RegularCustomerCard;

@UiController("customers_RegularCustomerCard.edit")
@UiDescriptor("regular-customer-card-edit.xml")
@EditedEntityContainer("regularCustomerCardDc")
@LoadDataBeforeShow
public class RegularCustomerCardEdit extends StandardEditor<RegularCustomerCard> {
}