package com.optivem.eshop.systemtest.driver.adapter.shop.api.client.controllers;

import com.optivem.eshop.systemtest.driver.adapter.shop.api.client.dtos.errors.ProblemDetailResponse;
import com.optivem.eshop.systemtest.driver.port.shop.dtos.SubmitReviewRequest;
import com.optivem.eshop.systemtest.driver.adapter.shared.client.http.JsonHttpClient;
import com.optivem.common.Result;

public class ReviewController {
    private static final String ORDERS_ENDPOINT = "/api/orders";

    private final JsonHttpClient<ProblemDetailResponse> httpClient;

    public ReviewController(JsonHttpClient<ProblemDetailResponse> httpClient) {
        this.httpClient = httpClient;
    }

    public Result<Void, ProblemDetailResponse> submitReview(SubmitReviewRequest request) {
        var orderNumber = request.getOrderNumber();
        return httpClient.post(ORDERS_ENDPOINT + "/" + orderNumber + "/review", request);
    }
}
