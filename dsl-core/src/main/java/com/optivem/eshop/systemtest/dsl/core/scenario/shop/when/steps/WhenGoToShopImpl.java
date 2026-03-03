package com.optivem.eshop.systemtest.dsl.core.scenario.shop.when.steps;

import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ExecutionResultBuilder;
import com.optivem.eshop.systemtest.dsl.port.shop.when.steps.base.WhenStep;

public class WhenGoToShopImpl extends BaseWhenStep<Void, VoidVerification> implements WhenStep {
    public WhenGoToShopImpl(AppDsl app) {
        super(app);
    }

    @Override
    protected ExecutionResult<Void, VoidVerification> execute(AppDsl app) {
        var result = app.shop().goToShop().execute();
        return new ExecutionResultBuilder<>(result).build();
    }
}

