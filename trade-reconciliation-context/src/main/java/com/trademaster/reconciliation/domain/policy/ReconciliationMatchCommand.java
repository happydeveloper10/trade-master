package com.trademaster.reconciliation.domain.policy;

import java.util.Objects;

public record ReconciliationMatchCommand(String runId) {
  public ReconciliationMatchCommand {
    Objects.requireNonNull(runId, "runId");
  }
}

