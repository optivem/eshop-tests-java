package com.optivem.eshop.systemtest.dsl.core.scenario.erp.then;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.base.ErpUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps.ThenFailureImpl;
import com.optivem.eshop.systemtest.dsl.core.scenario.erp.then.steps.ThenSuccessImpl;
import com.optivem.eshop.systemtest.dsl.port.erp.then.Then;

public class ThenImpl implements Then {
    private final AppDsl app;
    private final ErpUseCaseResult<Void, VoidVerification> result;
    private final String productSku;

    public ThenImpl(AppDsl app, ErpUseCaseResult<Void, VoidVerification> result, String productSku) {
        this.app = app;
        this.result = result;
        this.productSku = productSku;
    }

    public ThenSuccessImpl shouldSucceed() {
        result.shouldSucceed();
        return new ThenSuccessImpl(app, productSku);
    }

    public ThenFailureImpl shouldFail() {
        result.shouldFail();
        return new ThenFailureImpl();
    }
}
