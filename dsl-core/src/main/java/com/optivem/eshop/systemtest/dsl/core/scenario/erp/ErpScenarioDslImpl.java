package com.optivem.eshop.systemtest.dsl.core.scenario.erp;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.given.GivenImpl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.when.WhenImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.ErpScenarioDsl;

public class ErpScenarioDslImpl implements ErpScenarioDsl {
    private final AppDsl app;

    public ErpScenarioDslImpl(AppDsl app) {
        this.app = app;
    }

    public GivenImpl given() {
        return new GivenImpl(app);
    }

    public WhenImpl when() {
        return new WhenImpl(app);
    }
}
