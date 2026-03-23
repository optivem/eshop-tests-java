package com.optivem.eshop.systemtest.mod07.e2e.base;

import com.optivem.eshop.systemtest.mod07.base.BaseAppDslTest;
import com.optivem.eshop.dsl.port.ExternalSystemMode;

public abstract class BaseE2eTest extends BaseAppDslTest {
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}




