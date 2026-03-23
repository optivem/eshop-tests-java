package com.optivem.eshop.systemtest.mod08.smoke.external;

import com.optivem.eshop.systemtest.mod08.base.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class ErpSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToErp() {
        scenario.assume().erp().shouldBeRunning();
    }
}

