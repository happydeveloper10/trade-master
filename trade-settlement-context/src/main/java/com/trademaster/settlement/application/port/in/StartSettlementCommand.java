package com.trademaster.settlement.application.port.in;

import java.util.Objects;

public record StartSettlementCommand(String tradeReference) {
  public StartSettlementCommand {
    Objects.requireNonNull(tradeReference, "tradeReference");
  }
}

