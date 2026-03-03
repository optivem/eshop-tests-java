package com.optivem.eshop.systemtest.dsl.core.scenario.shop.when.steps;

import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ExecutionResultBuilder;
import com.optivem.eshop.systemtest.dsl.port.shop.when.steps.WhenCancelOrder;

import static com.optivem.eshop.systemtest.dsl.core.scenario.shop.ScenarioDefaults.DEFAULT_ORDER_NUMBER;

public class WhenCancelOrderImpl extends BaseWhenStep<Void, VoidVerification> implements WhenCancelOrder {
    private String orderNumber;

    public WhenCancelOrderImpl(AppDsl app) {
        super(app);
        withOrderNumber(DEFAULT_ORDER_NUMBER);
    }

    public WhenCancelOrderImpl withOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Override
    protected ExecutionResult<Void, VoidVerification> execute(AppDsl app) {
        var result = app.shop().cancelOrder()
                .orderNumber(orderNumber)
                .execute();

        return new ExecutionResultBuilder<>(result)
                .orderNumber(orderNumber)
                .build();
    }
}

