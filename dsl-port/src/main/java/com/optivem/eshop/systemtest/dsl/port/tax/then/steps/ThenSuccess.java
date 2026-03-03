package com.optivem.eshop.systemtest.dsl.port.tax.then.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.then.steps.base.ThenStep;

import java.math.BigDecimal;

public interface ThenSuccess extends ThenStep<ThenSuccess> {
    ThenSuccess country(String expectedCountryAlias);

    ThenSuccess taxRate(BigDecimal expectedTaxRate);

    ThenSuccess taxRate(double expectedTaxRate);

    ThenSuccess taxRate(String expectedTaxRate);

    ThenSuccess taxRateIsPositive();
}
