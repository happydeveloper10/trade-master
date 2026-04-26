package com.trademaster.identity.domain.model;

import java.util.Objects;

public class Account {
  private final AccountId accountId;
  private final CustomerId customerId;

  public Account(AccountId accountId, CustomerId customerId) {
    this.accountId = Objects.requireNonNull(accountId, "accountId");
    this.customerId = Objects.requireNonNull(customerId, "customerId");
  }

  public AccountId accountId() {
    return accountId;
  }

  public CustomerId customerId() {
    return customerId;
  }
}

