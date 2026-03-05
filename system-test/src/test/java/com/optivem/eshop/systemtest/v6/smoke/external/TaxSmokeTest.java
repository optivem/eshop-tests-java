package com.optivem.eshop.systemtest.v6.smoke.external;

import com.optivem.eshop.systemtest.base.v6.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class TaxSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToTax() {
        scenario.assume().tax().shouldBeRunning();
    }
}

