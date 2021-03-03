package com.company.customers.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "CUSTOMERS_CUSTOMER")
@Entity(name = "customers_Customer")
@NamePattern("%s %s|firstName,lastName")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -990562002484271232L;

    @NotNull
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @NotNull
    @Column(name = "TELEPHONE", nullable = false)
    private String telephone;

    @NotNull
    @Column(name = "DATE_REG", nullable = false)
    private LocalDate dateReg;

    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateReg() {
        return dateReg;
    }

    public void setDateReg(LocalDate dateReg) {
        this.dateReg = dateReg;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}