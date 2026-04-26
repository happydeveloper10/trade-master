package com.trademaster.execution.application.port.out;

import java.util.Objects;

public record RouteOrderToBrokerCommand(String orderId) {
  public RouteOrderToBrokerCommand {
    Objects.requireNonNull(orderId, "orderId");
  }
}

