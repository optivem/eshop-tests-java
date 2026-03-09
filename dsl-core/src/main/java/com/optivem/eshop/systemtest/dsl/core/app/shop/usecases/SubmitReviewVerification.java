package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.SubmitReviewResponse;
import com.optivem.eshop.systemtest.dsl.core.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.shared.UseCaseContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SubmitReviewVerification extends ResponseVerification<SubmitReviewResponse> {

    public SubmitReviewVerification(SubmitReviewResponse response, UseCaseContext context) {
        super(response, context);
    }

    public SubmitReviewVerification reviewIdIsNotNull() {
        assertThat(getResponse().getReviewId())
                .withFailMessage("Expected reviewId to be set, but was null")
                .isNotNull();
        return this;
    }

    public SubmitReviewVerification timestampIsNotNull() {
        assertThat(getResponse().getTimestamp())
                .withFailMessage("Expected timestamp to be set, but was null")
                .isNotNull();
        return this;
    }
}
