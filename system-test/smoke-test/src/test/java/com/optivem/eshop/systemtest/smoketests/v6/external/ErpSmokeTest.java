package com.optivem.eshop.systemtest.smoketests.v6.external;

import com.optivem.eshop.systemtest.base.v6.BaseErpScenarioDslTest;
import org.junit.jupiter.api.Test;

class ErpSmokeTest extends BaseErpScenarioDslTest {
    @Test
    void shouldBeAbleToGoToErp() {
        scenario
                .when().goToErp()
                .then().shouldSucceed();
    }
}

