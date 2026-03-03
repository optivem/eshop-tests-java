package com.optivem.eshop.systemtest.dsl.core.scenario.erp;

public class ExecutionResultContext {
    private final String productSku;

    public ExecutionResultContext(String productSku) {
        this.productSku = productSku;
    }

    public String getProductSku() {
        return productSku;
    }
}
