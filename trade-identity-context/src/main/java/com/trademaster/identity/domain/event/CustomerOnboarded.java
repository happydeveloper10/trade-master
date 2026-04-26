package com.trademaster.identity.domain.event;

import com.trademaster.identity.domain.model.CustomerId;
import com.trademaster.sharedkernel.domain.DomainEvent;
import java.time.Instant;
import java.util.Objects;

public record CustomerOnboarded(CustomerId customerId, Instant occurredAt) implements DomainEvent {
  public CustomerOnboarded {
    Objects.requireNonNull(customerId, "customerId");
    Objects.requireNonNull(occurredAt, "occurredAt");
  }
}

