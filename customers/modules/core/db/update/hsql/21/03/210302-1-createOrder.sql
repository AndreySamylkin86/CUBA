create table CUSTOMERS_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_NUMBER bigint not null,
    ORDER_SUM decimal(19, 2) not null,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
);