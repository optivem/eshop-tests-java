package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.BrowseCouponsResponse;
import com.optivem.eshop.systemtest.driver.port.shop.ShopDriver;
import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.base.BaseShopCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;

public class BrowseCoupons extends BaseShopCommand<BrowseCouponsResponse, BrowseCouponsVerification> {
    public BrowseCoupons(ShopDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    @Override
    public AppUseCaseResult<BrowseCouponsResponse, BrowseCouponsVerification> execute() {
        var result = driver.browseCoupons();
        return new AppUseCaseResult<>(result, context, BrowseCouponsVerification::new);
    }
}

