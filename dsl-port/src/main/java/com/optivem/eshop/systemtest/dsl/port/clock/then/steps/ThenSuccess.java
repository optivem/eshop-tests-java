package com.optivem.eshop.systemtest.dsl.port.clock.then.steps;

import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.base.ThenStep;

public interface ThenSuccess extends ThenStep<ThenSuccess> {
    ThenClock clock();
}
