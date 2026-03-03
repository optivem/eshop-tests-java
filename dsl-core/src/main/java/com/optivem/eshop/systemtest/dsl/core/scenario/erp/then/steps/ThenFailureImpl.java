package com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.base.ErpErrorVerification;
import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.base.ErpUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.ExecutionResultContext;
import com.optivem.eshop.systemtest.dsl.port.erp.then.steps.ThenFailure;

public class ThenFailureImpl<TSuccessResponse, TSuccessVerification extends ResponseVerification<TSuccessResponse>>
        implements ThenFailure {
    private final AppDsl app;
    private final ExecutionResultContext executionResult;
    private final ErpErrorVerification failureVerification;

    public ThenFailureImpl(AppDsl app, ExecutionResultContext executionResult,
            ErpUseCaseResult<TSuccessResponse, TSuccessVerification> result) {
        this.app = app;
        this.executionResult = executionResult;
        if (result == null) {
            throw new IllegalStateException("Cannot verify failure: no operation was executed");
        }
        this.failureVerification = result.shouldFail();
    }

    public ThenFailureImpl<TSuccessResponse, TSuccessVerification> and() {
        return this;
    }
}
