package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.base;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.errors.SystemError;
import com.optivem.common.Result;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseResult;

import java.util.function.BiFunction;

public class ShopUseCaseResult<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>>
        extends UseCaseResult<TSuccessResponse, SystemError, TSuccessVerification, SystemErrorFailureVerification> {

    public ShopUseCaseResult(
            Result<TSuccessResponse, SystemError> result,
            UseCaseContext context,
            BiFunction<TSuccessResponse, UseCaseContext, TSuccessVerification> verificationFactory) {
        super(result, context, verificationFactory, SystemErrorFailureVerification::new);
    }
}

