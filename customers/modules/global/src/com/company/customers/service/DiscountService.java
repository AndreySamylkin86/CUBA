package com.company.customers.service;

import org.graalvm.compiler.replacements.nodes.CStringConstant;

import java.util.UUID;

public interface DiscountService {
    String NAME = "customers_DiscountService";

    void discount ();
}