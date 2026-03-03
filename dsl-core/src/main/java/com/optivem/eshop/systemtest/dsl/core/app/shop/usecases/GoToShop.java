package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.ShopDriver;
import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.base.BaseShopCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;
import com.optivem.eshop.systemtest.dsl.core.app.shared.VoidVerification;

public class GoToShop extends BaseShopCommand<Void, VoidVerification> {
    public GoToShop(ShopDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public AppUseCaseResult<Void, VoidVerification> execute() {
        var result = driver.goToShop();
        return new AppUseCaseResult<>(result, context, VoidVerification::new);
    }
}

