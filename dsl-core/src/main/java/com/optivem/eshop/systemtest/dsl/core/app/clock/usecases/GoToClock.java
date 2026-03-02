package com.optivem.eshop.systemtest.dsl.core.app.clock.usecases;

import com.optivem.eshop.systemtest.driver.port.clock.ClockDriver;
import com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base.BaseClockCommand;
import com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base.ClockUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;

public class GoToClock extends BaseClockCommand<Void, VoidVerification> {
    public GoToClock(ClockDriver clockDriver, UseCaseContext useCaseContext) {
        super(clockDriver, useCaseContext);
    }

    @Override
    public ClockUseCaseResult<Void, VoidVerification> execute() {
        var result = driver.goToClock();
        return new ClockUseCaseResult<>(result, context, VoidVerification::new);
    }
}

