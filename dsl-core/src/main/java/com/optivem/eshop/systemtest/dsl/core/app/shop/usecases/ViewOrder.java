package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.ViewOrderResponse;
import com.optivem.eshop.systemtest.driver.port.shop.ShopDriver;
import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.base.BaseShopCommand;
import com.optivem.eshop.systemtest.dsl.core.app.shared.AppUseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;

public class ViewOrder extends BaseShopCommand<ViewOrderResponse, ViewOrderVerification> {
    private String orderNumberResultAlias;

    public ViewOrder(ShopDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    public ViewOrder orderNumber(String orderNumberResultAlias) {
        this.orderNumberResultAlias = orderNumberResultAlias;
        return this;
    }

    @Override
    public AppUseCaseResult<ViewOrderResponse, ViewOrderVerification> execute() {
        var orderNumber = context.getResultValue(orderNumberResultAlias);

        var result = driver.viewOrder(orderNumber);

        return new AppUseCaseResult<>(result, context, ViewOrderVerification::new);
    }
}

