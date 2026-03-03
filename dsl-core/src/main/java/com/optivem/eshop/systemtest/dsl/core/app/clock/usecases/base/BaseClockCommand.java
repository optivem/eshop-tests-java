package com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base;

import com.optivem.eshop.systemtest.driver.port.clock.ClockDriver;
import com.optivem.eshop.systemtest.driver.port.shared.error.ErrorResponse;
import com.optivem.eshop.systemtest.dsl.core.app.shared.BaseUseCase;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ErrorVerification;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;

public abstract class BaseClockCommand<TSuccessResponse, TSuccessVerification> extends BaseUseCase<ClockDriver, TSuccessResponse, ErrorResponse, TSuccessVerification, ErrorVerification> {
    protected BaseClockCommand(ClockDriver driver, UseCaseContext context) {
        super(driver, context);
    }
}

