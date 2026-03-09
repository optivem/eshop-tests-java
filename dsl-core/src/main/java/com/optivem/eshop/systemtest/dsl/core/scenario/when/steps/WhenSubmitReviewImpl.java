package com.optivem.eshop.systemtest.dsl.core.scenario.when.steps;

import com.optivem.eshop.systemtest.driver.port.shop.dtos.SubmitReviewResponse;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.app.shop.usecases.SubmitReviewVerification;
import com.optivem.eshop.systemtest.dsl.core.scenario.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.core.scenario.ExecutionResultBuilder;
import com.optivem.eshop.systemtest.dsl.port.when.steps.WhenSubmitReview;

import static com.optivem.eshop.systemtest.dsl.core.scenario.ScenarioDefaults.*;

public class WhenSubmitReviewImpl extends BaseWhenStep<SubmitReviewResponse, SubmitReviewVerification> implements WhenSubmitReview {
    private String reviewId;
    private String orderNumber;
    private String rating;
    private String comment;

    public WhenSubmitReviewImpl(AppDsl app) {
        super(app);
        this.reviewId = DEFAULT_REVIEW_ID;
        this.orderNumber = DEFAULT_ORDER_NUMBER;
        this.rating = DEFAULT_RATING;
        this.comment = EMPTY;
    }

    @Override
    public WhenSubmitReviewImpl withReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    @Override
    public WhenSubmitReviewImpl withOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @Override
    public WhenSubmitReviewImpl withRating(String rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public WhenSubmitReviewImpl withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    protected ExecutionResult<SubmitReviewResponse, SubmitReviewVerification> execute(AppDsl app) {
        var result = app.shop().submitReview()
                .orderNumber(orderNumber)
                .reviewId(reviewId)
                .rating(rating)
                .comment(comment)
                .execute();

        return new ExecutionResultBuilder<>(result)
                .orderNumber(orderNumber)
                .reviewId(reviewId)
                .build();
    }
}
