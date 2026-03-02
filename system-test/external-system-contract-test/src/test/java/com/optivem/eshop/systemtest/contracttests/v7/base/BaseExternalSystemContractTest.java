package com.optivem.eshop.systemtest.contracttests.v7.base;

import com.optivem.eshop.systemtest.base.v5.BaseAppDslTest;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ExternalSystemMode;

public abstract class BaseExternalSystemContractTest extends BaseAppDslTest {
    @Override
    protected abstract ExternalSystemMode getFixedExternalSystemMode();
}

