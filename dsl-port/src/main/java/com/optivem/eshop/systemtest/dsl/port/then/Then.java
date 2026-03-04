package com.optivem.eshop.systemtest.dsl.port.then;

import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenClock;
import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenCountry;
import com.optivem.eshop.systemtest.dsl.port.then.steps.ThenProduct;

public interface Then {
    ThenClock clock();

    ThenProduct product(String skuAlias);

    ThenCountry country(String countryAlias);
}

