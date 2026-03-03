package com.optivem.eshop.systemtest.dsl.port.tax.given.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.given.steps.base.GivenStep;

public interface GivenReturnsTaxRate extends GivenStep {
    GivenReturnsTaxRate country(String countryAlias);

    GivenReturnsTaxRate taxRate(String taxRate);

    GivenReturnsTaxRate taxRate(double taxRate);
}
