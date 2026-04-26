package com.trademaster.reconciliation.domain.policy;

public interface ReconciliationMatcher {
  void match(ReconciliationMatchCommand command);
}

