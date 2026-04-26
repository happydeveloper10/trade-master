package com.trademaster.identity.adapter.out;

import com.trademaster.identity.application.port.out.CustomerRepository;
import com.trademaster.identity.domain.model.Customer;
import com.trademaster.identity.domain.model.CustomerId;
import java.util.Optional;

public class StubCustomerRepositoryAdapter implements CustomerRepository {
  @Override
  public Optional<Customer> findById(CustomerId customerId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public void save(Customer customer) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

