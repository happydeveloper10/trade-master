package com.trademaster.order.domain.event;

import com.trademaster.order.domain.model.OrderId;
import com.trademaster.sharedkernel.domain.DomainEvent;
import java.time.Instant;
import java.util.Objects;

public record OrderSubmitted(OrderId orderId, Instant occurredAt) implements DomainEvent {
  public OrderSubmitted {
    Objects.requireNonNull(orderId, "orderId");
    Objects.requireNonNull(occurredAt, "occurredAt");
  }
}

