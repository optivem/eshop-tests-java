package com.optivem.eshop.systemtest.dsl.core.scenario.erp.when.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.ThenImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.when.steps.base.WhenStep;

public class WhenGoToErpImpl implements WhenStep {
    private final AppDsl app;

    public WhenGoToErpImpl(AppDsl app) {
        this.app = app;
    }

    public ThenImpl then() {
        var result = app.erp().goToErp().execute();
        return new ThenImpl(app, result, null);
    }
}
