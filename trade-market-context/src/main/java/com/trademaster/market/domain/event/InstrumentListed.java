package com.trademaster.market.domain.event;

import com.trademaster.market.domain.model.InstrumentId;
import com.trademaster.sharedkernel.domain.DomainEvent;
import java.time.Instant;
import java.util.Objects;

public record InstrumentListed(InstrumentId instrumentId, Instant occurredAt) implements DomainEvent {
  public InstrumentListed {
    Objects.requireNonNull(instrumentId, "instrumentId");
    Objects.requireNonNull(occurredAt, "occurredAt");
  }
}

