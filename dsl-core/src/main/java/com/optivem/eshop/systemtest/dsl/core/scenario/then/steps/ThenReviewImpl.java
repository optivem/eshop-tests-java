package com.optivem.eshop.systemtest.dsl.core.scenario.then.steps;

import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.ViewOrderVerification;
import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenReview;

public class ThenReviewImpl implements ThenReview {
    private final ViewOrderVerification verification;

    public ThenReviewImpl(ViewOrderVerification verification) {
        this.verification = verification;
    }

    @Override
    public ThenReview hasRating(int expectedRating) {
        verification.reviewRating(expectedRating);
        return this;
    }

    @Override
    public ThenReview hasComment(String expectedComment) {
        verification.reviewComment(expectedComment);
        return this;
    }

    @Override
    public ThenReview hasTimestamp() {
        verification.reviewTimestampIsNotNull();
        return this;
    }

    @Override
    public ThenReview and() {
        return this;
    }
}
