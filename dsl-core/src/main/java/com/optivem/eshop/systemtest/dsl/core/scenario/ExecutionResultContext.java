package com.optivem.eshop.systemtest.dsl.core.scenario;

public class ExecutionResultContext {
    private static final ExecutionResultContext EMPTY = new ExecutionResultContext(null, null, null);

    private final String orderNumber;
    private final String couponCode;
    private final String reviewId;

    public ExecutionResultContext(String orderNumber, String couponCode, String reviewId) {
        this.orderNumber = orderNumber;
        this.couponCode = couponCode;
        this.reviewId = reviewId;
    }

    public static ExecutionResultContext empty() {
        return EMPTY;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public String getReviewId() {
        return reviewId;
    }
}

