package com.trademaster.identity.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record AccountId(String value) implements Identifier {
  public AccountId {
    Objects.requireNonNull(value, "value");
  }
}

