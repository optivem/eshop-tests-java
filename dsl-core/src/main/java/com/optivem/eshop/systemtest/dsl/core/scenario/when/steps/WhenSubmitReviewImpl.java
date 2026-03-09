package com.optivem.eshop.systemtest.dsl.core.scenario.when.steps;

import com.optivem.eshop.systemtest.dsl.core.shared.VoidVerification;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.ExecutionResult;
import com.optivem.eshop.systemtest.dsl.port.when.steps.WhenSubmitReview;

public class WhenSubmitReviewImpl extends BaseWhenStep<Void, VoidVerification> implements WhenSubmitReview {
    private String rating;
    private String comment;

    public WhenSubmitReviewImpl(AppDsl app) {
        super(app);
    }

    public WhenSubmitReviewImpl withRating(String rating) {
        this.rating = rating;
        return this;
    }

    public WhenSubmitReviewImpl withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    protected ExecutionResult<Void, VoidVerification> execute(AppDsl app) {
        throw new UnsupportedOperationException("DSL skeleton");
    }
}
