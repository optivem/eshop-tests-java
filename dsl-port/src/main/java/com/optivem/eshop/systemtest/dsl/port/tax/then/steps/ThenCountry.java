package com.optivem.eshop.systemtest.dsl.port.tax.then.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.then.steps.base.ThenStep;

import java.math.BigDecimal;

public interface ThenCountry extends ThenStep<ThenCountry> {
    ThenCountry hasTaxRate(BigDecimal expectedTaxRate);

    ThenCountry hasTaxRate(double expectedTaxRate);

    ThenCountry hasTaxRate(String expectedTaxRate);

    ThenCountry hasPositiveTaxRate();
}
