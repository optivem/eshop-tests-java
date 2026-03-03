package com.optivem.eshop.systemtest.dsl.core.scenario.erp.given;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResultBuilder;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.given.steps.GivenProductImpl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.ThenImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.given.Given;

import java.util.ArrayList;
import java.util.List;

public class GivenImpl implements Given {
    private final AppDsl app;
    private final List<GivenProductImpl> products;

    public GivenImpl(AppDsl app) {
        this.app = app;
        this.products = new ArrayList<>();
    }

    public GivenProductImpl product() {
        var product = new GivenProductImpl(this);
        products.add(product);
        return product;
    }

    public ThenImpl then() {
        for (var product : products) {
            product.execute(app);
        }

        var result = app.erp().goToErp().execute();
        String lastSku = products.isEmpty() ? null : products.get(products.size() - 1).getSku();

        var executionResult = new ExecutionResultBuilder<>(result)
                .productSku(lastSku)
                .build();

        return new ThenImpl<>(app, executionResult);
    }

    AppDsl getApp() {
        return app;
    }
}
