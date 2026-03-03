package com.optivem.eshop.systemtest.base.v7;

import com.optivem.eshop.systemtest.configuration.BaseConfigurableTest;
import com.optivem.eshop.systemtest.dsl.core.app.AppDsl;
import com.optivem.eshop.systemtest.dsl.core.scenario.shop.ShopScenarioDslImpl;
import com.optivem.eshop.systemtest.dsl.port.shop.ShopScenarioDsl;
import com.optivem.common.Closer;
import com.optivem.eshop.systemtest.infrastructure.playwright.BrowserLifecycleExtension;
import com.optivem.testing.extensions.ChannelExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({ChannelExtension.class, BrowserLifecycleExtension.class})
public class BaseShopScenarioDslTest extends BaseConfigurableTest {
    private AppDsl app;
    protected ShopScenarioDsl scenario;

    @BeforeEach
    void setUp() {
        var configuration = loadConfiguration();
        app = createAppDsl(configuration);
        scenario = new ShopScenarioDslImpl(app);
    }

    @AfterEach
    void tearDown() {
        Closer.close(app);
    }
}

