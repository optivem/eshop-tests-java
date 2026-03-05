package com.optivem.eshop.systemtest.v5.smoke.external;

import com.optivem.eshop.systemtest.v5.base.BaseAppDslTest;
import org.junit.jupiter.api.Test;

class ErpSmokeTest extends BaseAppDslTest {
    @Test
    void shouldBeAbleToGoToErp() {
        app.erp().goToErp()
                .execute()
                .shouldSucceed();
    }
}


