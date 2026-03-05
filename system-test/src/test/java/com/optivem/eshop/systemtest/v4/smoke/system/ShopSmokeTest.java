package com.optivem.eshop.systemtest.v4.smoke.system;

import com.optivem.eshop.systemtest.v4.base.BaseChannelDriverTest;
import com.optivem.eshop.systemtest.channel.ChannelType;
import com.optivem.testing.Channel;
import org.junit.jupiter.api.TestTemplate;

import static com.optivem.common.ResultAssert.assertThatResult;

class ShopSmokeTest extends BaseChannelDriverTest {
    @TestTemplate
    @Channel({ChannelType.UI, ChannelType.API})
    void shouldBeAbleToGoToShop() {
        var result = shopDriver.goToShop();
        assertThatResult(result).isSuccess();
    }
}

