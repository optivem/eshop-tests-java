package com.optivem.eshop.systemtest.dsl.core.scenario.given.steps;

import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.given.GivenImpl;
import com.optivem.eshop.systemtest.dsl.port.given.steps.GivenReview;

import static com.optivem.eshop.systemtest.dsl.core.scenario.ScenarioDefaults.*;

public class GivenReviewImpl extends BaseGivenStep implements GivenReview {
    private String orderNumber;
    private String rating;

    public GivenReviewImpl(GivenImpl given) {
        super(given);
        this.orderNumber = DEFAULT_ORDER_NUMBER;
        this.rating = DEFAULT_RATING;
    }

    public GivenReviewImpl withOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public GivenReviewImpl withRating(String rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public void execute(AppDsl app) {
        app.shop().submitReview()
                .orderNumber(orderNumber)
                .rating(rating)
                .execute()
                .shouldSucceed();
    }
}
