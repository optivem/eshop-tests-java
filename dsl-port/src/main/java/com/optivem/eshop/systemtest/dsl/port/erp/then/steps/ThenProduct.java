package com.optivem.eshop.systemtest.dsl.port.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.base.ThenStep;

import java.math.BigDecimal;

public interface ThenProduct extends ThenStep<ThenProduct> {
    ThenProduct hasSku(String skuParamAlias);

    ThenProduct hasPrice(BigDecimal expectedPrice);

    ThenProduct hasPrice(double expectedPrice);

    ThenProduct hasPrice(String expectedPrice);
}
