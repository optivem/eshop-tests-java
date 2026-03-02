package com.optivem.eshop.systemtest.smoketests.v6.external;

import com.optivem.eshop.systemtest.base.v5.BaseAppDslTest;
import org.junit.jupiter.api.Test;

class ErpSmokeTest extends BaseAppDslTest {
    @Test
    void shouldBeAbleToGoToErp() {
        app.erp().goToErp()
                .execute()
                .shouldSucceed();
    }
}

