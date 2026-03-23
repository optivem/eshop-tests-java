package com.optivem.eshop.systemtest.mod09.smoke.external;

import com.optivem.eshop.systemtest.mod09.base.BaseScenarioDslTest;
import org.junit.jupiter.api.Test;

class ClockSmokeTest extends BaseScenarioDslTest {
    @Test
    void shouldBeAbleToGoToClock() {
        scenario.assume().clock().shouldBeRunning();
    }
}


