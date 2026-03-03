package com.optivem.eshop.systemtest.dsl.core.scenario.erp.given.steps;

import com.optivem.common.Converter;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.given.GivenImpl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.ThenImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.given.steps.GivenProduct;

public class GivenProductImpl implements GivenProduct {
    private final GivenImpl given;
    private String sku;
    private String unitPrice;

    public GivenProductImpl(GivenImpl given) {
        this.given = given;
    }

    public GivenProductImpl withSku(String skuParamAlias) {
        this.sku = skuParamAlias;
        return this;
    }

    public GivenProductImpl withUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public GivenProductImpl withUnitPrice(double unitPrice) {
        return withUnitPrice(Converter.fromDouble(unitPrice));
    }

    public GivenImpl and() {
        return given;
    }

    public ThenImpl then() {
        return given.then();
    }

    public String getSku() {
        return sku;
    }

    public void execute(AppDsl app) {
        app.erp().returnsProduct()
                .sku(sku)
                .unitPrice(unitPrice)
                .execute()
                .shouldSucceed();
    }
}
