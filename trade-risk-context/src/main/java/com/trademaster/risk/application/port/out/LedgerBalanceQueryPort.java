package com.trademaster.risk.application.port.out;

import com.trademaster.sharedkernel.finance.Money;

public interface LedgerBalanceQueryPort {
  Money currentCashBalance(String accountId);
}

