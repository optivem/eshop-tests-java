package com.optivem.eshop.systemtest.dsl.port.clock.given;

import com.optivem.eshop.systemtest.dsl.port.clock.given.steps.GivenClock;
import com.optivem.eshop.systemtest.dsl.port.clock.then.Then;

public interface Given {
    GivenClock givenClock();

    Then then();
}
