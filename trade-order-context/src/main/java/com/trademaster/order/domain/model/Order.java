package com.trademaster.order.domain.model;

import java.util.Objects;

public class Order {
  private final OrderId orderId;

  public Order(OrderId orderId) {
    this.orderId = Objects.requireNonNull(orderId, "orderId");
  }

  public OrderId orderId() {
    return orderId;
  }
}

