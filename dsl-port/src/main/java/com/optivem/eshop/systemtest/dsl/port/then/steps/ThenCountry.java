package com.optivem.eshop.systemtest.dsl.port.then.steps;

public interface ThenCountry {
    ThenCountry hasCountry(String country);

    ThenCountry hasTaxRate(double taxRate);

    ThenCountry hasTaxRateIsPositive();
}

