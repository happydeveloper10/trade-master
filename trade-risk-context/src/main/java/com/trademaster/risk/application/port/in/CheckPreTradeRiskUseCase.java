package com.trademaster.risk.application.port.in;

public interface CheckPreTradeRiskUseCase {
  PreTradeRiskDecision check(PreTradeRiskCommand command);
}

