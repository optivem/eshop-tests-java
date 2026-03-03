package com.optivem.eshop.systemtest.dsl.port.tax.then.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.then.steps.base.ThenStep;

import java.math.BigDecimal;

public interface ThenCountry extends ThenStep<ThenCountry> {
    ThenCountry taxRate(BigDecimal expectedTaxRate);

    ThenCountry taxRate(double expectedTaxRate);

    ThenCountry taxRate(String expectedTaxRate);

    ThenCountry taxRateIsPositive();
}
