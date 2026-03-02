package com.optivem.eshop.systemtest.dsl.core.app.tax.usecases.base;

import com.optivem.eshop.systemtest.driver.port.tax.dtos.error.TaxErrorResponse;
import com.optivem.common.Result;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseResult;

import java.util.function.BiFunction;

public class TaxUseCaseResult<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>>
        extends UseCaseResult<TSuccessResponse, TaxErrorResponse, TSuccessVerification, TaxErrorVerification> {

    public TaxUseCaseResult(
            Result<TSuccessResponse, TaxErrorResponse> result,
            UseCaseContext context,
            BiFunction<TSuccessResponse, UseCaseContext, TSuccessVerification> verificationFactory) {
        super(result, context, verificationFactory, TaxErrorVerification::new);
    }
}

