package com.optivem.eshop.systemtest.dsl.core;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.port.BackgroundDsl;
import com.optivem.eshop.systemtest.dsl.port.background.Should;

public class BackgroundDslImpl implements BackgroundDsl {
    private final AppDsl app;

    public BackgroundDslImpl(AppDsl app) {
        this.app = app;
    }

    @Override
    public Should shop() {
        return () -> {
            app.shop().goToShop().execute().shouldSucceed();
            return this;
        };
    }

    @Override
    public Should erp() {
        return () -> {
            app.erp().goToErp().execute().shouldSucceed();
            return this;
        };
    }

    @Override
    public Should tax() {
        return () -> {
            app.tax().goToTax().execute().shouldSucceed();
            return this;
        };
    }

    @Override
    public Should clock() {
        return () -> {
            app.clock().goToClock().execute().shouldSucceed();
            return this;
        };
    }
}
