package com.company.customers.web.screens.regularcustomercard;

import com.haulmont.cuba.gui.screen.*;
import com.company.customers.entity.RegularCustomerCard;

@UiController("customers_RegularCustomerCard.browse")
@UiDescriptor("regular-customer-card-browse.xml")
@LookupComponent("regularCustomerCardsTable")
@LoadDataBeforeShow
public class RegularCustomerCardBrowse extends StandardLookup<RegularCustomerCard> {
}