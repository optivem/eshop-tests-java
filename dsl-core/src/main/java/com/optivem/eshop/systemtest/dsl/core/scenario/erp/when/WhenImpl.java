package com.optivem.eshop.systemtest.dsl.core.scenario.erp.when;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.when.steps.WhenGoToErpImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.when.When;

public class WhenImpl implements When {
    private final AppDsl app;

    public WhenImpl(AppDsl app) {
        this.app = app;
    }

    public WhenGoToErpImpl goToErp() {
        return new WhenGoToErpImpl(app);
    }
}
