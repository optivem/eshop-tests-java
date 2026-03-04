package com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.when.steps;

import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.when.steps.base.WhenStep;

public interface WhenCancelOrder extends WhenStep {
    WhenCancelOrder withOrderNumber(String orderNumber);
}
