package com.optivem.eshop.systemtest.dsl.core.scenario.shop;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.port.shop.ShopScenarioDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.given.GivenImpl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.when.WhenImpl;

public class ShopScenarioDslImpl implements ShopScenarioDsl {
    private final AppDsl app;
    private boolean executed = false;

    public ShopScenarioDslImpl(AppDsl app) {
        this.app = app;
    }

    public GivenImpl given() {
        ensureNotExecuted();
        return new GivenImpl(app);
    }

    public WhenImpl when() {
        ensureNotExecuted();
        return new WhenImpl(app);
    }

    public void markAsExecuted() {
        this.executed = true;
    }

    private void ensureNotExecuted() {
        if (executed) {
            throw new IllegalStateException("Scenario has already been executed. " +
                    "Each test method should contain only ONE scenario execution (GivenImpl-WhenImpl-ThenImpl). " +
                    "Split multiple scenarios into separate test methods.");
        }
    }
}

