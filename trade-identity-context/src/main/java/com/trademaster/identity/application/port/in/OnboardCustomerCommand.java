package com.trademaster.identity.application.port.in;

import java.util.Objects;

public record OnboardCustomerCommand(String externalReference) {
  public OnboardCustomerCommand {
    Objects.requireNonNull(externalReference, "externalReference");
  }
}

