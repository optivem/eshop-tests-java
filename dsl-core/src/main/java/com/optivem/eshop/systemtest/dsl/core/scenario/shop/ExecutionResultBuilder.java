package com.optivem.eshop.systemtest.dsl.core.scenario.shop;

import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;

public class ExecutionResultBuilder<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>> {
    private final AppUseCaseResult<TSuccessResponse, TSuccessVerification> result;
    private String orderNumber;
    private String couponCode;

    public ExecutionResultBuilder(AppUseCaseResult<TSuccessResponse, TSuccessVerification> result) {
        this.result = result;
    }

    public ExecutionResultBuilder<TSuccessResponse, TSuccessVerification> orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public ExecutionResultBuilder<TSuccessResponse, TSuccessVerification> couponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }

    public ExecutionResult<TSuccessResponse, TSuccessVerification> build() {
        return new ExecutionResult<>(result, orderNumber, couponCode);
    }
}

