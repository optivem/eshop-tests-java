package com.optivem.eshop.systemtest.dsl.port.clock.then.steps;

import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.base.ThenStep;

import java.time.Instant;

public interface ThenSuccess extends ThenStep<ThenSuccess> {
    ThenSuccess timeIsNotNull();

    ThenSuccess time(Instant expectedTime);

    ThenSuccess time(String expectedTime);

    ThenSuccess timeIsAfter(Instant time);

    ThenSuccess timeIsBefore(Instant time);

    ThenSuccess timeIsBetween(Instant start, Instant end);
}
