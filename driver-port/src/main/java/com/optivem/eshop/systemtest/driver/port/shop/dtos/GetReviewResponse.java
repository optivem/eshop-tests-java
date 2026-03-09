package com.optivem.eshop.systemtest.driver.port.shop.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetReviewResponse {
    private String reviewId;
    private String orderNumber;
    private Instant timestamp;
    private int rating;
    private String comment;
}
