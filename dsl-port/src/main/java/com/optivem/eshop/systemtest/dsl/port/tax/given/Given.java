package com.optivem.eshop.systemtest.dsl.port.tax.given;

import com.optivem.eshop.systemtest.dsl.port.tax.given.steps.GivenCountry;
import com.optivem.eshop.systemtest.dsl.port.tax.then.Then;

public interface Given {
    GivenCountry country();

    Then then();
}
