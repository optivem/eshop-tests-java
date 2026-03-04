package com.optivem.eshop.systemtest.dsl.port.shop.feature;

import com.optivem.eshop.systemtest.dsl.port.shop.feature.background.BackgroundDsl;
import com.optivem.eshop.systemtest.dsl.port.shop.feature.scenario.ScenarioDsl;

public interface FeatureDsl {
    BackgroundDsl background();

    ScenarioDsl scenario();
}
