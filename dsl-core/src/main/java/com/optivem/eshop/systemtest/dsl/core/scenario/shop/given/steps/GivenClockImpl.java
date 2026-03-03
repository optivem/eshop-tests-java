package com.optivem.eshop.systemtest.dsl.core.scenario.shop.given.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ScenarioDefaults;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.given.GivenImpl;
import com.optivem.eshop.systemtest.dsl.port.shop.given.steps.GivenClock;

public class GivenClockImpl extends BaseGivenStep implements GivenClock {
    private String time;

    public GivenClockImpl(GivenImpl given) {
        super(given);
        withTime(ScenarioDefaults.DEFAULT_TIME);
    }

    public GivenClockImpl withTime(String time) {
        this.time = time;
        return this;
    }

    @Override
    public void execute(AppDsl app) {
        app.clock().returnsTime()
            .time(time)
            .execute()
            .shouldSucceed();
    }
}

