package com.optivem.eshop.systemtest.dsl.port;

import com.optivem.eshop.systemtest.dsl.port.BackgroundDsl;
import com.optivem.eshop.systemtest.dsl.port.ScenarioDsl;

public interface FeatureDsl {
    BackgroundDsl background();

    ScenarioDsl scenario();
}
