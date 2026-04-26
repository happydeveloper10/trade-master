package com.trademaster.ledger.application.service;

import com.trademaster.ledger.application.port.in.ReserveFundsCommand;
import com.trademaster.ledger.application.port.in.ReserveFundsUseCase;
import com.trademaster.ledger.application.port.out.LedgerAccountRepository;
import com.trademaster.ledger.domain.model.ReservationId;

public class ReserveFundsApplicationService implements ReserveFundsUseCase {
  private final LedgerAccountRepository ledgerAccountRepository;

  public ReserveFundsApplicationService(LedgerAccountRepository ledgerAccountRepository) {
    this.ledgerAccountRepository = ledgerAccountRepository;
  }

  @Override
  public ReservationId reserve(ReserveFundsCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

