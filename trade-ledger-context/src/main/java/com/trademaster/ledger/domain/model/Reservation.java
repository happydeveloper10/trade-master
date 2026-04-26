package com.trademaster.ledger.domain.model;

import com.trademaster.sharedkernel.finance.Money;
import java.util.Objects;

public class Reservation {
  private final ReservationId reservationId;
  private final Money amount;

  public Reservation(ReservationId reservationId, Money amount) {
    this.reservationId = Objects.requireNonNull(reservationId, "reservationId");
    this.amount = Objects.requireNonNull(amount, "amount");
  }

  public ReservationId reservationId() {
    return reservationId;
  }

  public Money amount() {
    return amount;
  }
}

