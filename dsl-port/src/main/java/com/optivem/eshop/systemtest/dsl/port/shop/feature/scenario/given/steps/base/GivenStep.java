package com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.given.steps.base;

import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.given.Given;
import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.then.Then;
import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.when.When;

public interface GivenStep {
    Given and();

    When when();

    Then then();
}
