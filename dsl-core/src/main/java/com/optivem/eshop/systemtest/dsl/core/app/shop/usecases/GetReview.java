package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.ShopDriver;
import com.optivem.eshop.systemtest.driver.port.shop.dtos.GetReviewResponse;
import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.base.BaseShopUseCase;
import com.optivem.eshop.systemtest.dsl.core.shared.UseCaseResult;
import com.optivem.eshop.systemtest.dsl.core.shared.UseCaseContext;

public class GetReview extends BaseShopUseCase<GetReviewResponse, GetReviewVerification> {
    private String reviewIdAlias;

    public GetReview(ShopDriver driver, UseCaseContext context) {
        super(driver, context);
    }

    public GetReview reviewId(String reviewIdAlias) {
        this.reviewIdAlias = reviewIdAlias;
        return this;
    }

    @Override
    public UseCaseResult<GetReviewResponse, GetReviewVerification> execute() {
        var reviewId = context.getResultValue(reviewIdAlias);
        var result = driver.getReview(reviewId);
        return new UseCaseResult<>(result, context, GetReviewVerification::new);
    }
}
