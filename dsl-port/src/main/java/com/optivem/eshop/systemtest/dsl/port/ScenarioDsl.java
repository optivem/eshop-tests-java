package com.optivem.eshop.systemtest.dsl.port;

import com.optivem.eshop.systemtest.dsl.port.assume.Assume;
import com.optivem.eshop.systemtest.dsl.port.given.Given;
import com.optivem.eshop.systemtest.dsl.port.when.When;

public interface ScenarioDsl {
    Assume assume();

    Given given();

    When when();
}

