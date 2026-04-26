package com.trademaster.risk.application.port.in;

import java.util.Objects;

public record PreTradeRiskCommand(String accountId, String orderId) {
  public PreTradeRiskCommand {
    Objects.requireNonNull(accountId, "accountId");
    Objects.requireNonNull(orderId, "orderId");
  }
}

