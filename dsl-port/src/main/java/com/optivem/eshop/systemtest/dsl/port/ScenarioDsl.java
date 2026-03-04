package com.optivem.eshop.systemtest.dsl.port;

import com.optivem.eshop.systemtest.dsl.port.scenario.assume.Assume;
import com.optivem.eshop.systemtest.dsl.port.scenario.given.Given;
import com.optivem.eshop.systemtest.dsl.port.scenario.when.When;

public interface ScenarioDsl {
    Assume assume();

    Given given();

    When when();
}
