package com.optivem.eshop.systemtest.dsl.core.app.erp.usecases;

import com.optivem.eshop.systemtest.driver.port.erp.ErpDriver;
import com.optivem.eshop.systemtest.dsl.core.app.erp.usecases.base.BaseErpCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;

public class GoToErp extends BaseErpCommand<Void, VoidVerification> {
    public GoToErp(ErpDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public AppUseCaseResult<Void, VoidVerification> execute() {
        var result = driver.goToErp();
        return new AppUseCaseResult<>(result, context, VoidVerification::new);
    }
}

