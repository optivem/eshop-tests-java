package com.optivem.eshop.systemtest.mod09.smoke.external;

import com.optivem.eshop.systemtest.mod09.base.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class TaxSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToTax() {
        scenario.assume().tax().shouldBeRunning();
    }
}


