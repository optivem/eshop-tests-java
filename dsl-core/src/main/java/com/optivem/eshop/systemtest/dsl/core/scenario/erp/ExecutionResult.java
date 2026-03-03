package com.optivem.eshop.systemtest.dsl.core.scenario.erp;

import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.base.ErpUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import lombok.Getter;

@Getter
public class ExecutionResult<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>> {
    private final ErpUseCaseResult<TSuccessResponse, TSuccessVerification> result;
    private final ExecutionResultContext context;

    ExecutionResult(ErpUseCaseResult<TSuccessResponse, TSuccessVerification> result, String productSku) {
        if (result == null) {
            throw new IllegalArgumentException("Result cannot be null");
        }
        this.result = result;
        this.context = new ExecutionResultContext(productSku);
    }
}
