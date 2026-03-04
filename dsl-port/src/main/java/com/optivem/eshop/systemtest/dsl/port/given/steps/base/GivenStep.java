package com.optivem.eshop.systemtest.dsl.port.given.steps.base;

import com.optivem.eshop.systemtest.dsl.port.given.GivenStage;
import com.optivem.eshop.systemtest.dsl.port.then.ThenStage;
import com.optivem.eshop.systemtest.dsl.port.when.WhenStage;

public interface GivenStep {
    GivenStage and();

    WhenStage when();

    ThenStage then();
}


