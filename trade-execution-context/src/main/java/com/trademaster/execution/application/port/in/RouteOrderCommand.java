package com.trademaster.execution.application.port.in;

import java.util.Objects;

public record RouteOrderCommand(String orderId) {
  public RouteOrderCommand {
    Objects.requireNonNull(orderId, "orderId");
  }
}

