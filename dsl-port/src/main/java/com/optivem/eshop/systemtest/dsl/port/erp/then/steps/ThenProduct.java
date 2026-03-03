package com.optivem.eshop.systemtest.dsl.port.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.base.ThenStep;

import java.math.BigDecimal;

public interface ThenProduct extends ThenStep<ThenProduct> {
    ThenProduct sku(String skuParamAlias);

    ThenProduct price(BigDecimal expectedPrice);

    ThenProduct price(double expectedPrice);

    ThenProduct price(String expectedPrice);
}
