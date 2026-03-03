package com.optivem.eshop.systemtest.dsl.port.erp.given.steps;

import com.optivem.eshop.systemtest.dsl.port.erp.given.steps.base.GivenStep;

public interface GivenProduct extends GivenStep {
    GivenProduct withSku(String skuParamAlias);

    GivenProduct withUnitPrice(String unitPrice);

    GivenProduct withUnitPrice(double unitPrice);
}
