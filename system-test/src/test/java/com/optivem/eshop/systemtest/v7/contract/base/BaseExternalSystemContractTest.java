package com.optivem.eshop.systemtest.v7.contract.base;

import com.optivem.eshop.systemtest.base.v5.BaseAppDslTest;
import com.optivem.eshop.systemtest.dsl.port.ExternalSystemMode;
import com.optivem.eshop.systemtest.dsl.core.ScenarioDslImpl;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseExternalSystemContractTest extends BaseAppDslTest {
    protected ScenarioDslImpl scenario;

    @BeforeEach
    void setUpScenario() {
        scenario = new ScenarioDslImpl(app);
    }

    @Override
    protected abstract ExternalSystemMode getFixedExternalSystemMode();
}

