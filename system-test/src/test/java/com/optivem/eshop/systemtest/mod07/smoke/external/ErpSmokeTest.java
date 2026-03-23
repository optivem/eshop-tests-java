package com.optivem.eshop.systemtest.mod07.smoke.external;

import com.optivem.eshop.systemtest.mod07.base.BaseAppDslTest;
import org.junit.jupiter.api.Test;

class ErpSmokeTest extends BaseAppDslTest {
    @Test
    void shouldBeAbleToGoToErp() {
        app.erp().goToErp()
                .execute()
                .shouldSucceed();
    }
}


