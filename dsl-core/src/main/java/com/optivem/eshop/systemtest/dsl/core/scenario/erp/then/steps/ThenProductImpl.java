package com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.GetProductVerification;
import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.ThenProduct;

import java.math.BigDecimal;

public class ThenProductImpl implements ThenProduct {
    private final GetProductVerification verification;

    public ThenProductImpl(AppDsl app, String sku) {
        this.verification = app.erp().getProduct()
                .sku(sku)
                .execute()
                .shouldSucceed();
    }

    public ThenProductImpl hasSku(String skuParamAlias) {
        verification.sku(skuParamAlias);
        return this;
    }

    public ThenProductImpl hasPrice(BigDecimal expectedPrice) {
        verification.price(expectedPrice);
        return this;
    }

    public ThenProductImpl hasPrice(double expectedPrice) {
        verification.price(expectedPrice);
        return this;
    }

    public ThenProductImpl hasPrice(String expectedPrice) {
        verification.price(expectedPrice);
        return this;
    }

    public ThenProductImpl and() {
        return this;
    }
}
