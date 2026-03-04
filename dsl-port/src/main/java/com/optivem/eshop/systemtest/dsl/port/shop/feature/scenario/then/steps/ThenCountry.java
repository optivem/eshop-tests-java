package com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.then.steps;

public interface ThenCountry {
    ThenCountry hasCountry(String country);

    ThenCountry hasTaxRate(double taxRate);

    ThenCountry hasTaxRateIsPositive();
}
