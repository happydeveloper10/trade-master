package com.trademaster.risk.adapter.out;

import com.trademaster.risk.application.port.out.LedgerBalanceQueryPort;
import com.trademaster.sharedkernel.finance.Money;

public class StubLedgerBalanceQueryAdapter implements LedgerBalanceQueryPort {
  @Override
  public Money currentCashBalance(String accountId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

