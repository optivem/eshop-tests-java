package com.optivem.eshop.systemtest.dsl.core.scenario.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.GetReviewVerification;
import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenReview;

public class ThenReviewImpl implements ThenReview {
    private final GetReviewVerification verification;

    public ThenReviewImpl(GetReviewVerification verification) {
        this.verification = verification;
    }

    @Override
    public ThenReview hasRating(int expectedRating) {
        verification.rating(expectedRating);
        return this;
    }

    @Override
    public ThenReview hasComment(String expectedComment) {
        verification.comment(expectedComment);
        return this;
    }

    @Override
    public ThenReview hasReviewId() {
        verification.reviewIdIsNotNull();
        return this;
    }

    @Override
    public ThenReview hasTimestamp() {
        verification.timestampIsNotNull();
        return this;
    }

    @Override
    public ThenReview and() {
        return this;
    }
}
