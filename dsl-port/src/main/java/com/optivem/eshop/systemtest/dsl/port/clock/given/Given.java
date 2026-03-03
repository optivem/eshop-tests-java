package com.optivem.eshop.systemtest.dsl.port.clock.given;

import com.optivem.eshop.systemtest.dsl.port.clock.given.steps.GivenReturnsTime;
import com.optivem.eshop.systemtest.dsl.port.clock.then.Then;

public interface Given {
    GivenReturnsTime returnsTime();

    Then then();
}
