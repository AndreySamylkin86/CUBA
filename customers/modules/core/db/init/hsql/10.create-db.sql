-- begin CUSTOMERS_CUSTOMER
create table CUSTOMERS_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    TELEPHONE varchar(255) not null,
    DATE_REG date not null,
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end CUSTOMERS_CUSTOMER
-- begin CUSTOMERS_ORDER
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
    ORDER_SUM decimal(19, 2),
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CUSTOMERS_ORDER
-- begin CUSTOMERS_REGULAR_CUSTOMER_CARD
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
    TOTAL_OF_ALL_ORDERS decimal(19, 2),
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CUSTOMERS_REGULAR_CUSTOMER_CARD
