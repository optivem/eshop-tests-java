package com.optivem.eshop.systemtest.dsl.port.clock.given;

import com.optivem.eshop.systemtest.dsl.port.clock.given.steps.GivenReturnsTime;
import com.optivem.eshop.systemtest.dsl.port.clock.when.When;

public interface Given {
    GivenReturnsTime returnsTime();

    When when();
}
