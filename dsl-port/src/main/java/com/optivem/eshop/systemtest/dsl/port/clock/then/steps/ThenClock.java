package com.optivem.eshop.systemtest.dsl.port.clock.then.steps;

import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.base.ThenStep;

import java.time.Instant;

public interface ThenClock extends ThenStep<ThenClock> {
    ThenClock timeIsNotNull();

    ThenClock time(Instant expectedTime);

    ThenClock time(String expectedTime);

    ThenClock timeIsAfter(Instant time);

    ThenClock timeIsBefore(Instant time);

    ThenClock timeIsBetween(Instant start, Instant end);
}
