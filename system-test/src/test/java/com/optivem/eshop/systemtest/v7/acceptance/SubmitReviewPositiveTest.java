package com.optivem.eshop.systemtest.v7.acceptance;

import com.optivem.eshop.systemtest.v7.acceptance.base.BaseAcceptanceTest;
import com.optivem.eshop.systemtest.channel.ChannelType;
import com.optivem.eshop.systemtest.driver.port.shop.dtos.OrderStatus;
import com.optivem.testing.Channel;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.TestTemplate;

class SubmitReviewPositiveTest extends BaseAcceptanceTest {
    @Disabled("AT \u00b7 RED \u00b7 TEST")
    @TestTemplate
    @Channel({ChannelType.UI, ChannelType.API})
    void canSubmitReviewOnDeliveredOrder() {
        scenario
                .given().order()
                    .withStatus(OrderStatus.DELIVERED)
                .and().product()
                    .withReviewable(true)
                .when().submitReview()
                    .withRating("5")
                    .withComment("Excellent functionality")
                .then().shouldSucceed()
                .and().order()
                    .hasReviewRating("5")
                    .hasReviewComment("Excellent functionality");
    }

    // TODO: Can submit a review without a comment
}
