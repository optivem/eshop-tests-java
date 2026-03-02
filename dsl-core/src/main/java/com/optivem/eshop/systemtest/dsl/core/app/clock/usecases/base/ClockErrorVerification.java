package com.optivem.eshop.systemtest.dsl.core.app.clock.usecases.base;

import com.optivem.eshop.systemtest.driver.port.clock.dtos.error.ClockErrorResponse;
import com.optivem.eshop.systemtest.dsl.core.app.shared.ResponseVerification;
import com.optivem.eshop.systemtest.dsl.core.app.shared.UseCaseContext;

public class ClockErrorVerification extends ResponseVerification<ClockErrorResponse> {
    public ClockErrorVerification(ClockErrorResponse clockErrorResponse, UseCaseContext useCaseContext) {
        super(clockErrorResponse, useCaseContext);
    }
}

