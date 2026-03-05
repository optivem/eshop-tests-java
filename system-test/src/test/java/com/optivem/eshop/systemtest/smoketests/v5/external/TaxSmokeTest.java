package com.optivem.eshop.systemtest.smoketests.v5.external;

import com.optivem.eshop.systemtest.base.v5.BaseAppDslTest;
import org.junit.jupiter.api.Test;

class TaxSmokeTest extends BaseAppDslTest {
    @Test
    void shouldBeAbleToGoToTax() {
        app.tax().goToTax()
                .execute()
                .shouldSucceed();
    }
}


