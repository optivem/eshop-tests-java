package com.optivem.eshop.systemtest.dsl.port.shop.when.steps;

import com.optivem.eshop.systemtest.dsl.port.shop.when.steps.base.WhenStep;

public interface WhenPublishCoupon extends WhenStep {
    WhenPublishCoupon withCouponCode(String couponCode);

    WhenPublishCoupon withDiscountRate(String discountRate);

    WhenPublishCoupon withDiscountRate(double discountRate);

    WhenPublishCoupon withValidFrom(String validFrom);

    WhenPublishCoupon withValidTo(String validTo);

    WhenPublishCoupon withUsageLimit(String usageLimit);

    WhenPublishCoupon withUsageLimit(int usageLimit);
}

