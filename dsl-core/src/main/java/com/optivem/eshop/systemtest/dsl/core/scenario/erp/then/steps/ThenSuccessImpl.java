package com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResultContext;
import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.ThenSuccess;

public class ThenSuccessImpl<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>>
        implements ThenSuccess {
    private final AppDsl app;
    private final ExecutionResultContext executionResult;
    private final TSuccessVerification successVerification;

    public ThenSuccessImpl(AppDsl app, ExecutionResultContext executionResult, TSuccessVerification successVerification) {
        this.app = app;
        this.executionResult = executionResult;
        this.successVerification = successVerification;
    }

    public ThenProductImpl product() {
        var productSku = executionResult.getProductSku();
        if (productSku == null) {
            throw new IllegalStateException("Cannot verify product: no product was configured in the given step");
        }
        return new ThenProductImpl(app, productSku);
    }

    public ThenSuccessImpl<TSuccessResponse, TSuccessVerification> and() {
        return this;
    }
}
