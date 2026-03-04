package com.optivem.eshop.systemtest.dsl.port.shop.background;

public interface BackgroundDsl {
    BackgroundDsl shopRunning();

    BackgroundDsl erpRunning();

    BackgroundDsl taxRunning();

    BackgroundDsl clockRunning();
}
