package com.optivem.eshop.systemtest.v6.e2e.base;

import com.optivem.eshop.systemtest.base.v6.BaseScenarioDslTest;
import com.optivem.eshop.systemtest.dsl.port.ExternalSystemMode;

public class BaseE2eTest extends BaseScenarioDslTest {
    
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}




