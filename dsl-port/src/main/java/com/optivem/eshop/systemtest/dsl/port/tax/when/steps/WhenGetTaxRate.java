package com.optivem.eshop.systemtest.dsl.port.tax.when.steps;

import com.optivem.eshop.systemtest.dsl.port.tax.when.steps.base.WhenStep;

public interface WhenGetTaxRate extends WhenStep {
    WhenGetTaxRate country(String countryValueOrAlias);
}
