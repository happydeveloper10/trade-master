package com.trademaster.risk.application.service;

import com.trademaster.risk.application.port.in.CheckPreTradeRiskUseCase;
import com.trademaster.risk.application.port.in.PreTradeRiskCommand;
import com.trademaster.risk.application.port.in.PreTradeRiskDecision;
import com.trademaster.risk.application.port.out.LedgerBalanceQueryPort;

public class PreTradeRiskApplicationService implements CheckPreTradeRiskUseCase {
  private final LedgerBalanceQueryPort ledgerBalanceQueryPort;

  public PreTradeRiskApplicationService(LedgerBalanceQueryPort ledgerBalanceQueryPort) {
    this.ledgerBalanceQueryPort = ledgerBalanceQueryPort;
  }

  @Override
  public PreTradeRiskDecision check(PreTradeRiskCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

