package com.trademaster.risk.application.port.in;

import java.util.Objects;

public record PreTradeRiskDecision(String decision, String reason) {
  public PreTradeRiskDecision {
    Objects.requireNonNull(decision, "decision");
    Objects.requireNonNull(reason, "reason");
  }
}

