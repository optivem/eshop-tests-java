package com.optivem.eshop.systemtest.dsl.core.app.shop.commons;

import com.optivem.eshop.systemtest.driver.port.shared.error.ErrorResponse;
import com.optivem.common.Result;

public final class SystemResults {
    private SystemResults() {
        // Utility class
    }

    public static <T> Result<T, ErrorResponse> success(T value) {
        return Result.success(value);
    }

    public static Result<Void, ErrorResponse> success() {
        return Result.success();
    }

    public static <T> Result<T, ErrorResponse> failure(String message) {
        return Result.failure(ErrorResponse.of(message));
    }

    public static <T> Result<T, ErrorResponse> failure(ErrorResponse error) {
        return Result.failure(error);
    }
}

