package com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.ThenSuccess;

public class ThenSuccessImpl implements ThenSuccess {
    private final AppDsl app;
    private final String productSku;

    public ThenSuccessImpl(AppDsl app, String productSku) {
        this.app = app;
        this.productSku = productSku;
    }

    public ThenProductImpl product() {
        if (productSku == null) {
            throw new IllegalStateException("Cannot verify product: no product was configured in the given step");
        }
        return new ThenProductImpl(app, productSku);
    }

    public ThenSuccessImpl and() {
        return this;
    }
}
