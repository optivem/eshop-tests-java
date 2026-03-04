package com.optivem.eshop.systemtest.dsl.port.given;

import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenClock;
import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenCountry;
import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenCoupon;
import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenOrder;
import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenProduct;
import com.optivem.eshop.systemtest.dsl.port.then.Then;
import com.optivem.eshop.systemtest.dsl.port.when.When;

public interface Given {
    GivenClock clock();

    GivenProduct product();

    GivenCountry country();

    GivenOrder order();

    GivenCoupon coupon();

    When when();

    Then then();
}

