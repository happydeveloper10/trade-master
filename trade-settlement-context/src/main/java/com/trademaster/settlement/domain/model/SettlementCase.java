package com.trademaster.settlement.domain.model;

import java.util.Objects;

public class SettlementCase {
  private final SettlementCaseId settlementCaseId;

  public SettlementCase(SettlementCaseId settlementCaseId) {
    this.settlementCaseId = Objects.requireNonNull(settlementCaseId, "settlementCaseId");
  }

  public SettlementCaseId settlementCaseId() {
    return settlementCaseId;
  }
}

