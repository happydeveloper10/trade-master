package com.trademaster.order.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record OrderId(String value) implements Identifier {
  public OrderId {
    Objects.requireNonNull(value, "value");
  }
}

