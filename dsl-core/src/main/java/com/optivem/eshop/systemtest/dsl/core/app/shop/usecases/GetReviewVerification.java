package com.optivem.eshop.systemtest.dsl.core.app.shop.usecases;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.GetReviewResponse;
import com.optivem.eshop.systemtest.dsl.core.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.shared.UseCaseContext;

import static org.assertj.core.api.Assertions.assertThat;

public class GetReviewVerification extends ResponseVerification<GetReviewResponse> {

    public GetReviewVerification(GetReviewResponse response, UseCaseContext context) {
        super(response, context);
    }

    public GetReviewVerification orderNumber(String expectedOrderNumber) {
        var actualOrderNumber = getResponse().getOrderNumber();
        assertThat(actualOrderNumber)
                .withFailMessage("Expected orderNumber to be '%s', but was '%s'", expectedOrderNumber, actualOrderNumber)
                .isEqualTo(expectedOrderNumber);
        return this;
    }

    public GetReviewVerification rating(int expectedRating) {
        var actualRating = getResponse().getRating();
        assertThat(actualRating)
                .withFailMessage("Expected rating to be %d, but was %d", expectedRating, actualRating)
                .isEqualTo(expectedRating);
        return this;
    }

    public GetReviewVerification comment(String expectedComment) {
        var actualComment = getResponse().getComment();
        assertThat(actualComment)
                .withFailMessage("Expected comment to be '%s', but was '%s'", expectedComment, actualComment)
                .isEqualTo(expectedComment);
        return this;
    }

    public GetReviewVerification reviewIdIsNotNull() {
        var actualReviewId = getResponse().getReviewId();
        assertThat(actualReviewId)
                .withFailMessage("Expected reviewId to be set, but was null")
                .isNotNull();
        return this;
    }

    public GetReviewVerification timestampIsNotNull() {
        var actualTimestamp = getResponse().getTimestamp();
        assertThat(actualTimestamp)
                .withFailMessage("Expected timestamp to be set, but was null")
                .isNotNull();
        return this;
    }
}
