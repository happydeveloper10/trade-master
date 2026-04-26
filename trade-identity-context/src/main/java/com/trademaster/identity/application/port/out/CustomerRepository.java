package com.trademaster.identity.application.port.out;

import com.trademaster.identity.domain.model.Customer;
import com.trademaster.identity.domain.model.CustomerId;
import java.util.Optional;

public interface CustomerRepository {
  Optional<Customer> findById(CustomerId customerId);

  void save(Customer customer);
}

