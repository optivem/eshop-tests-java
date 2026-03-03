package com.optivem.eshop.systemtest.dsl.port.tax.given.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.given.steps.base.GivenStep;

public interface GivenReturnsTaxRate extends GivenStep {
    GivenReturnsTaxRate withCountry(String countryAlias);

    GivenReturnsTaxRate withTaxRate(String taxRate);

    GivenReturnsTaxRate withTaxRate(double taxRate);
}
