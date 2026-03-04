package com.optivem.eshop.systemtest.dsl.port;

import com.optivem.eshop.systemtest.dsl.port.background.Should;

public interface BackgroundDsl {
    Should shop();

    Should erp();

    Should tax();

    Should clock();
}
