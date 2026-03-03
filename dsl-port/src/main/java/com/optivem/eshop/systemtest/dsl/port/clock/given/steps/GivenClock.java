package com.optivem.eshop.systemtest.dsl.port.clock.given.steps;

import com.optivem.eshop.systemtest.dsl.port.clock.given.steps.base.GivenStep;

public interface GivenClock extends GivenStep {
    GivenClock withTime(String time);
}
