create table CUSTOMERS_REGULAR_CUSTOMER_CARD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DISCOUNT integer,
    TOTAL_OF_ALL_ORDERS varchar(255),
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
);