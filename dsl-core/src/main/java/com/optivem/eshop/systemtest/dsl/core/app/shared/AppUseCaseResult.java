package com.optivem.eshop.systemtest.dsl.core.app.shared;

import com.optivem.eshop.systemtest.driver.port.shared.error.ErrorResponse;
import com.optivem.common.Result;

import java.util.function.BiFunction;

public class AppUseCaseResult<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>>
        extends UseCaseResult<TSuccessResponse, ErrorResponse, TSuccessVerification, ErrorVerification> {

    public AppUseCaseResult(
            Result<TSuccessResponse, ErrorResponse> result,
            UseCaseContext context,
            BiFunction<TSuccessResponse, UseCaseContext, TSuccessVerification> verificationFactory) {
        super(result, context, verificationFactory, ErrorVerification::new);
    }
}
