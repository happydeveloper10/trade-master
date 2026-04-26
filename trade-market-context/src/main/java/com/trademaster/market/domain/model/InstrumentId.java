package com.trademaster.market.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record InstrumentId(String value) implements Identifier {
  public InstrumentId {
    Objects.requireNonNull(value, "value");
  }
}

