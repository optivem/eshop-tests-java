package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.SubmitReviewResponse;
import com.optivem.eshop.systemtest.dsl.core.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.shared.UseCaseContext;

public class SubmitReviewVerification extends ResponseVerification<SubmitReviewResponse> {
    public SubmitReviewVerification(SubmitReviewResponse response, UseCaseContext context) {
        super(response, context);
    }

    public SubmitReviewVerification reviewId(String reviewIdResultAlias) {
        var expectedReviewId = getContext().getResultValue(reviewIdResultAlias);
        var actualReviewId = getResponse().getReviewId();
        org.assertj.core.api.Assertions.assertThat(actualReviewId)
                .withFailMessage("Expected review ID to be '%s', but was '%s'", expectedReviewId, actualReviewId)
                .isEqualTo(expectedReviewId);
        return this;
    }
}
