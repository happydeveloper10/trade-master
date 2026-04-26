package com.trademaster.reconciliation.domain.model;

import java.util.Objects;

public class Break {
  private final BreakId breakId;

  public Break(BreakId breakId) {
    this.breakId = Objects.requireNonNull(breakId, "breakId");
  }

  public BreakId breakId() {
    return breakId;
  }
}

