package com.optivem.eshop.systemtest.dsl.port.tax.then;

import com.optivem.eshop.systemtest.dsl.port.tax.then.steps.ThenFailure;
import com.optivem.eshop.systemtest.dsl.port.tax.then.steps.ThenSuccess;

public interface Then {
    ThenSuccess shouldSucceed();

    ThenFailure shouldFail();
}
