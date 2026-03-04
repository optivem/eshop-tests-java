package com.optivem.eshop.systemtest.dsl.port.shop.feature.background;

public interface BackgroundDsl {
    BackgroundDsl shopRunning();

    BackgroundDsl erpRunning();

    BackgroundDsl taxRunning();

    BackgroundDsl clockRunning();
}
