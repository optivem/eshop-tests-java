package com.optivem.eshop.systemtest.dsl.core.scenario.erp.when.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResultBuilder;
import com.optivem.eshop.systemtest.dsl.port.erp.when.steps.base.WhenStep;

public class WhenGoToErpImpl extends BaseWhenStep<Void, VoidVerification> implements WhenStep {
    public WhenGoToErpImpl(AppDsl app) {
        super(app);
    }

    @Override
    protected ExecutionResult<Void, VoidVerification> execute(AppDsl app) {
        var result = app.erp().goToErp().execute();
        return new ExecutionResultBuilder<>(result).build();
    }
}
