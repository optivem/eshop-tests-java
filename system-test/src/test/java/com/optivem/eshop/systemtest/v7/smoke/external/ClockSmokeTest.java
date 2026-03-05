package com.optivem.eshop.systemtest.v7.smoke.external;

import com.optivem.eshop.systemtest.base.v7.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class ClockSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToClock() {
        scenario.assume().clock().shouldBeRunning();
    }
}


