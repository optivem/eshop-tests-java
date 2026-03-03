package com.optivem.eshop.systemtest.dsl.port.erp.given.steps;

import com.optivem.eshop.systemtest.dsl.port.erp.given.steps.base.GivenStep;

public interface GivenReturnsProduct extends GivenStep {
    GivenReturnsProduct withSku(String skuParamAlias);

    GivenReturnsProduct withUnitPrice(String unitPrice);

    GivenReturnsProduct withUnitPrice(double unitPrice);
}
