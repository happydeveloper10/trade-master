package com.trademaster.ledger.application.port.in;

import com.trademaster.ledger.domain.model.ReservationId;

public interface ReserveFundsUseCase {
  ReservationId reserve(ReserveFundsCommand command);
}

