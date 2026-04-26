package com.trademaster.settlement.application.port.in;

import com.trademaster.settlement.domain.model.SettlementCaseId;

public interface StartSettlementUseCase {
  SettlementCaseId start(StartSettlementCommand command);
}

