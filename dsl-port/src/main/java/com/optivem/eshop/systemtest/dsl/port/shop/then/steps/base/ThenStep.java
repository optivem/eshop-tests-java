package com.optivem.eshop.systemtest.dsl.port.shop.then.steps.base;

import com.optivem.eshop.systemtest.dsl.port.shop.then.steps.ThenCoupon;
import com.optivem.eshop.systemtest.dsl.port.shop.then.steps.ThenOrder;

public interface ThenStep<TThen> {
    TThen and();

    ThenOrder order();

    ThenOrder order(String orderNumber);

    ThenCoupon coupon();

    ThenCoupon coupon(String couponCode);
}
