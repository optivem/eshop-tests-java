package com.optivem.eshop.systemtest.e2etests.v7.base;

import com.optivem.eshop.systemtest.base.v7.BaseShopScenarioDslTest;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ExternalSystemMode;

public class BaseE2eTest extends BaseShopScenarioDslTest {
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}


