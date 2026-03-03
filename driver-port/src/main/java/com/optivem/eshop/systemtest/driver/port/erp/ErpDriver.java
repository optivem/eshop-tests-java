package com.optivem.eshop.systemtest.driver.port.erp;

import com.optivem.eshop.systemtest.driver.port.erp.dtos.GetProductRequest;
import com.optivem.eshop.systemtest.driver.port.erp.dtos.GetProductResponse;
import com.optivem.eshop.systemtest.driver.port.erp.dtos.ReturnsProductRequest;
import com.optivem.eshop.systemtest.driver.port.shared.error.ErrorResponse;
import com.optivem.common.Result;

public interface ErpDriver extends AutoCloseable {
    Result<Void, ErrorResponse> goToErp();

    Result<GetProductResponse, ErrorResponse> getProduct(GetProductRequest request);

    Result<Void, ErrorResponse> returnsProduct(ReturnsProductRequest request);
}

