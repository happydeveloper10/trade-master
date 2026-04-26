package com.trademaster.identity.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record CustomerId(String value) implements Identifier {
  public CustomerId {
    Objects.requireNonNull(value, "value");
  }
}

