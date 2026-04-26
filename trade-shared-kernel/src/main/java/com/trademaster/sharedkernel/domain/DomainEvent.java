package com.trademaster.sharedkernel.domain;

import java.time.Instant;

public interface DomainEvent {
  Instant occurredAt();
}

