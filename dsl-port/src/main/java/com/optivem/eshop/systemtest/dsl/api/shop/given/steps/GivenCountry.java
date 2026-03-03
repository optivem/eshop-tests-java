package com.optivem.eshop.systemtest.dsl.port.shop.given.steps;

import com.optivem.eshop.systemtest.dsl.port.shop.given.steps.base.GivenStep;

public interface GivenCountry extends GivenStep {
    GivenCountry withCode(String country);

    GivenCountry withTaxRate(String taxRate);

    GivenCountry withTaxRate(double taxRate);

}

