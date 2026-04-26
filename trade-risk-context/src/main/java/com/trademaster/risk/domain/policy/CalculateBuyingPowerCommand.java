package com.trademaster.risk.domain.policy;

import java.util.Objects;

public record CalculateBuyingPowerCommand(String accountId) {
  public CalculateBuyingPowerCommand {
    Objects.requireNonNull(accountId, "accountId");
  }
}

