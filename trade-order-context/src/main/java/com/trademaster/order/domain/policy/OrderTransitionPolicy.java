package com.trademaster.order.domain.policy;

public interface OrderTransitionPolicy {
  void assertTransitionAllowed(AssertOrderTransitionCommand command);
}

