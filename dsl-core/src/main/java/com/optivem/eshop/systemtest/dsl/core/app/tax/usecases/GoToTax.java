package com.optivem.eshop.systemtest.dsl.core.app.tax.usecases;

import com.optivem.eshop.systemtest.driver.port.tax.TaxDriver;
import com.optivem.eshop.systemtest.dsl.core.app.tax.usecases.base.BaseTaxCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;

public class GoToTax extends BaseTaxCommand<Void, VoidVerification> {
    public GoToTax(TaxDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public AppUseCaseResult<Void, VoidVerification> execute() {
        var result = driver.goToTax();
        return new AppUseCaseResult<>(result, context, VoidVerification::new);
    }
}

