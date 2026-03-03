package com.optivem.eshop.systemtest.dsl.port.clock.given.steps.base;

import com.optivem.eshop.systemtest.dsl.port.clock.given.Given;
import com.optivem.eshop.systemtest.dsl.port.clock.then.Then;

public interface GivenStep {
    Given and();

    Then then();
}
