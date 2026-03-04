package com.optivem.eshop.systemtest.dsl.port;

public interface BackgroundDsl {
    BackgroundDsl shopRunning();

    BackgroundDsl erpRunning();

    BackgroundDsl taxRunning();

    BackgroundDsl clockRunning();
}
