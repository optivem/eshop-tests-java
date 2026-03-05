package com.optivem.eshop.systemtest.v5.e2e.base;

import com.optivem.eshop.systemtest.base.v5.BaseAppDslTest;
import com.optivem.eshop.systemtest.dsl.port.ExternalSystemMode;

public abstract class BaseE2eTest extends BaseAppDslTest {
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}




