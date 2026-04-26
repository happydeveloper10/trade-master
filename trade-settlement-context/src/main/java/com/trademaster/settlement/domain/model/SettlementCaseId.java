package com.trademaster.settlement.domain.model;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record SettlementCaseId(String value) implements Identifier {
  public SettlementCaseId {
    Objects.requireNonNull(value, "value");
  }
}

