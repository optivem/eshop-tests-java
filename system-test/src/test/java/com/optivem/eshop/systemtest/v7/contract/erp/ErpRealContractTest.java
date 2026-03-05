package com.optivem.eshop.systemtest.v7.contract.erp;

import com.optivem.eshop.systemtest.dsl.port.ExternalSystemMode;

public class ErpRealContractTest extends BaseErpContractTest {
    @Override
    protected ExternalSystemMode getFixedExternalSystemMode() {
        return ExternalSystemMode.REAL;
    }
}



