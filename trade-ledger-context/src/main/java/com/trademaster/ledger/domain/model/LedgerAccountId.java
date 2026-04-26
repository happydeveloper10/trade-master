package com.trademaster.ledger.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record LedgerAccountId(String value) implements Identifier {
  public LedgerAccountId {
    Objects.requireNonNull(value, "value");
  }
}

