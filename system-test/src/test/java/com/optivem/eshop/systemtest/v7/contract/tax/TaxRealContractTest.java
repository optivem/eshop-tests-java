package com.optivem.eshop.systemtest.v7.contract.tax;

import com.optivem.eshop.systemtest.dsl.port.ExternalSystemMode;

public class TaxRealContractTest extends BaseTaxContractTest {
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}



