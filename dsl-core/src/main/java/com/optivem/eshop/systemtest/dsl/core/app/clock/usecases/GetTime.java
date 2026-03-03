package com.optivem.eshop.systemtest.dsl.core.app.clock.usecases;

import com.optivem.eshop.systemtest.driver.port.clock.ClockDriver;
import com.optivem.eshop.systemtest.driver.port.clock.dtos.GetTimeResponse;
import com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base.BaseClockCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;

public class GetTime extends BaseClockCommand<GetTimeResponse, GetTimeVerification> {
    public GetTime(ClockDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public AppUseCaseResult<GetTimeResponse, GetTimeVerification> execute() {
        var result = driver.getTime();
        return new AppUseCaseResult<>(result, context, GetTimeVerification::new);
    }
}

