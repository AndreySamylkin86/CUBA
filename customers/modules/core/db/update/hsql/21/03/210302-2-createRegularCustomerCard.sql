alter table CUSTOMERS_REGULAR_CUSTOMER_CARD add constraint FK_CUSTOMERS_REGULAR_CUSTOMER_CARD_ON_CUSTOMER foreign key (CUSTOMER_ID) references CUSTOMERS_CUSTOMER(ID);
create index IDX_CUSTOMERS_REGULAR_CUSTOMER_CARD_ON_CUSTOMER on CUSTOMERS_REGULAR_CUSTOMER_CARD (CUSTOMER_ID);
