package com.trademaster.settlement.application.service;

import com.trademaster.settlement.application.port.in.StartSettlementCommand;
import com.trademaster.settlement.application.port.in.StartSettlementUseCase;
import com.trademaster.settlement.domain.model.SettlementCaseId;

public class StartSettlementApplicationService implements StartSettlementUseCase {
  @Override
  public SettlementCaseId start(StartSettlementCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

