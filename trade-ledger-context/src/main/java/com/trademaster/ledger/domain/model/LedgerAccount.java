package com.trademaster.ledger.domain.model;

import com.trademaster.sharedkernel.finance.Money;
import java.util.Objects;

public class LedgerAccount {
  private final LedgerAccountId ledgerAccountId;

  public LedgerAccount(LedgerAccountId ledgerAccountId) {
    this.ledgerAccountId = Objects.requireNonNull(ledgerAccountId, "ledgerAccountId");
  }

  public LedgerAccountId ledgerAccountId() {
    return ledgerAccountId;
  }

  public Money balance() {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

