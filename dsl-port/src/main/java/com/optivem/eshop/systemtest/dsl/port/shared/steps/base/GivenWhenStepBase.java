package com.optivem.eshop.systemtest.dsl.port.shared.steps.base;

public interface GivenWhenStepBase<TGiven, TWhen> {
    TGiven and();

    TWhen when();
}
