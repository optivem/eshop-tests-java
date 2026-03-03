package com.optivem.eshop.systemtest.dsl.port.tax.given.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.given.steps.base.GivenStep;

public interface GivenCountry extends GivenStep {
    GivenCountry withCountry(String countryAlias);

    GivenCountry withTaxRate(String taxRate);

    GivenCountry withTaxRate(double taxRate);
}
