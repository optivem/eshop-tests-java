package com.optivem.eshop.systemtest.dsl.port.tax.given;

import com.optivem.eshop.systemtest.dsl.port.tax.given.steps.GivenReturnsTaxRate;
import com.optivem.eshop.systemtest.dsl.port.tax.when.When;

public interface Given {
    GivenReturnsTaxRate returnsTaxRate();

    When when();
}
