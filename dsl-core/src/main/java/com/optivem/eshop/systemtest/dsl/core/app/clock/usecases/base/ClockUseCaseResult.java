package com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base;

import com.optivem.eshop.systemtest.driver.port.clock.dtos.error.ClockErrorResponse;
import com.optivem.common.Result;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseResult;

import java.util.function.BiFunction;

public class ClockUseCaseResult<TSuccessResponse, TSuccessVerification>
        extends UseCaseResult<TSuccessResponse, ClockErrorResponse, TSuccessVerification, ClockErrorVerification> {
    public ClockUseCaseResult(Result<TSuccessResponse, ClockErrorResponse> result,
                              UseCaseContext context,
                              BiFunction<TSuccessResponse, UseCaseContext, TSuccessVerification> verificationFactory) {
        super(result, context, verificationFactory, ClockErrorVerification::new);
    }
}

