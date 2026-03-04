package com.optivem.eshop.systemtest.dsl.core.feature;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.feature.background.BackgroundDslImpl;
import com.optivem.eshop.systemtest.dsl.core.feature.scenario.ScenarioDslImpl;
import com.optivem.eshop.systemtest.dsl.port.shop.feature.FeatureDsl;
import com.optivem.eshop.systemtest.dsl.port.shop.feature.background.BackgroundDsl;

public class FeatureDslImpl implements FeatureDsl {
    private final AppDsl app;

    public FeatureDslImpl(AppDsl app) {
        this.app = app;
    }

    @Override
    public BackgroundDsl background() {
        return new BackgroundDslImpl(app);
    }

    @Override
    public ScenarioDslImpl scenario() {
        return new ScenarioDslImpl(app);
    }
}
