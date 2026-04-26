package com.trademaster.ledger.application.port.in;

import com.trademaster.sharedkernel.finance.Money;
import java.util.Objects;

public record ReserveFundsCommand(String purpose, Money amount) {
  public ReserveFundsCommand {
    Objects.requireNonNull(purpose, "purpose");
    Objects.requireNonNull(amount, "amount");
  }
}

