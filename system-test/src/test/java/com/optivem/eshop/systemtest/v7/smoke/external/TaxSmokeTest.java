package com.optivem.eshop.systemtest.v7.smoke.external;

import com.optivem.eshop.systemtest.base.v7.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class TaxSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToTax() {
        scenario.assume().tax().shouldBeRunning();
    }
}


