package com.optivem.eshop.systemtest.dsl.port.erp.given;

import com.optivem.eshop.systemtest.dsl.port.erp.given.steps.GivenProduct;
import com.optivem.eshop.systemtest.dsl.port.erp.then.Then;

public interface Given {
    GivenProduct product();

    Then then();
}
