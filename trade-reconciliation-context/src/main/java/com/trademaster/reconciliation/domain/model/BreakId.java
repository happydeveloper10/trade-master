package com.trademaster.reconciliation.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record BreakId(String value) implements Identifier {
  public BreakId {
    Objects.requireNonNull(value, "value");
  }
}

