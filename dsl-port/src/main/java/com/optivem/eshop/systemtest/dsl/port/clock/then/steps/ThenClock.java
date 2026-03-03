package com.optivem.eshop.systemtest.dsl.port.clock.then.steps;

import com.optivem.eshop.systemtest.dsl.port.clock.then.steps.base.ThenStep;

import java.time.Instant;

public interface ThenClock extends ThenStep<ThenClock> {
    ThenClock hasTimeNotNull();

    ThenClock hasTime(Instant expectedTime);

    ThenClock hasTime(String expectedTime);

    ThenClock hasTimeAfter(Instant time);

    ThenClock hasTimeBefore(Instant time);

    ThenClock hasTimeBetween(Instant start, Instant end);
}
