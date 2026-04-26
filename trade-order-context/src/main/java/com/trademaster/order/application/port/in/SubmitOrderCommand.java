package com.trademaster.order.application.port.in;

import java.util.Objects;

public record SubmitOrderCommand(String clientOrderId) {
  public SubmitOrderCommand {
    Objects.requireNonNull(clientOrderId, "clientOrderId");
  }
}

