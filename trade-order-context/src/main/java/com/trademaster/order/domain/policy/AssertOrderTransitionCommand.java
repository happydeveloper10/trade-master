package com.trademaster.order.domain.policy;

import java.util.Objects;

public record AssertOrderTransitionCommand(String fromStatus, String toStatus) {
  public AssertOrderTransitionCommand {
    Objects.requireNonNull(fromStatus, "fromStatus");
    Objects.requireNonNull(toStatus, "toStatus");
  }
}

