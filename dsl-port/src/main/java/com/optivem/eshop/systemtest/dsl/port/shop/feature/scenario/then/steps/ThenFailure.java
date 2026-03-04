package com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.then.steps;

import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.then.steps.base.ThenStep;

public interface ThenFailure extends ThenStep<ThenFailure> {
    ThenFailure errorMessage(String expectedMessage);

    ThenFailure fieldErrorMessage(String expectedField, String expectedMessage);
}
