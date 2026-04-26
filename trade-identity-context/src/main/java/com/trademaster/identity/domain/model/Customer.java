package com.trademaster.identity.domain.model;

import java.util.Objects;

public class Customer {
  private final CustomerId customerId;

  public Customer(CustomerId customerId) {
    this.customerId = Objects.requireNonNull(customerId, "customerId");
  }

  public CustomerId customerId() {
    return customerId;
  }
}

