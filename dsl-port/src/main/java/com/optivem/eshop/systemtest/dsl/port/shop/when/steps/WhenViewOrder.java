package com.optivem.eshop.systemtest.dsl.port.shop.when.steps;

import com.optivem.eshop.systemtest.dsl.port.shop.when.steps.base.WhenStep;

public interface WhenViewOrder extends WhenStep {
    WhenViewOrder withOrderNumber(String orderNumber);
}

