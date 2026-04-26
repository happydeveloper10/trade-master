package com.trademaster.ledger.domain.event;

import com.trademaster.ledger.domain.model.ReservationId;
import com.trademaster.sharedkernel.domain.DomainEvent;
import java.time.Instant;
import java.util.Objects;

public record ReservationCreated(ReservationId reservationId, Instant occurredAt) implements DomainEvent {
  public ReservationCreated {
    Objects.requireNonNull(reservationId, "reservationId");
    Objects.requireNonNull(occurredAt, "occurredAt");
  }
}

