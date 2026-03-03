package com.optivem.eshop.systemtest.smoketests.v7.system;

import com.optivem.eshop.systemtest.base.v7.BaseShopScenarioDslTest;
import com.optivem.eshop.systemtest.channel.ChannelType;
import com.optivem.testing.Channel;
import org.junit.jupiter.api.TestTemplate;

class ShopSmokeTest extends BaseShopScenarioDslTest {
    @TestTemplate
    @Channel({ChannelType.UI, ChannelType.API})
    void shouldBeAbleToGoToShop() {
        scenario
                .when().goToShop()
                .then().shouldSucceed();
    }
}

