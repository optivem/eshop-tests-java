package com.optivem.eshop.systemtest.dsl.port.clock.then;

import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.ThenFailure;
import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.ThenSuccess;

public interface Then {
    ThenSuccess shouldSucceed();

    ThenFailure shouldFail();
}
