package com.optivem.eshop.systemtest.dsl.port.shared.steps.base;

public interface GivenThenStepBase<TGiven, TThen> {
    TGiven and();

    TThen then();
}
