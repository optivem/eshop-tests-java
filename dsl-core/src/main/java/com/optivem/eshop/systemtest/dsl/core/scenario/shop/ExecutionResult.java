package com.optivem.eshop.systemtest.dsl.core.scenario.shop;

import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import lombok.Getter;

@Getter
public class ExecutionResult<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>> {
    private final AppUseCaseResult<TSuccessResponse, TSuccessVerification> result;
    private final ExecutionResultContext context;

    ExecutionResult(AppUseCaseResult<TSuccessResponse, TSuccessVerification> result, String orderNumber, String couponCode) {
        if (result == null) {
            throw new IllegalArgumentException("Result cannot be null");
        }
        this.result = result;
        this.context = new ExecutionResultContext(orderNumber, couponCode);
    }
}

