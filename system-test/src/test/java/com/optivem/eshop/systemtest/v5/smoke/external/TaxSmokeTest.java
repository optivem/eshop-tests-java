package com.optivem.eshop.systemtest.v5.smoke.external;

import com.optivem.eshop.systemtest.v5.base.BaseAppDslTest;
import org.junit.jupiter.api.Test;

class TaxSmokeTest extends BaseAppDslTest {
    @Test
    void shouldBeAbleToGoToTax() {
        app.tax().goToTax()
                .execute()
                .shouldSucceed();
    }
}


