package com.optivem.eshop.systemtest.dsl.port.then;

import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenFailure;
import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenSuccess;

public interface ThenResult extends Then {
    ThenSuccess shouldSucceed();

    ThenFailure shouldFail();
}

