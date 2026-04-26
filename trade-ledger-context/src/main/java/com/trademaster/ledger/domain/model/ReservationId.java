package com.trademaster.ledger.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record ReservationId(String value) implements Identifier {
  public ReservationId {
    Objects.requireNonNull(value, "value");
  }
}

