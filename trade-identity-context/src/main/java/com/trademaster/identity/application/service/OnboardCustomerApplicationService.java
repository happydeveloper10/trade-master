package com.trademaster.identity.application.service;

import com.trademaster.identity.application.port.in.OnboardCustomerCommand;
import com.trademaster.identity.application.port.in.OnboardCustomerUseCase;
import com.trademaster.identity.application.port.out.CustomerRepository;
import com.trademaster.identity.domain.model.CustomerId;

public class OnboardCustomerApplicationService implements OnboardCustomerUseCase {
  private final CustomerRepository customerRepository;

  public OnboardCustomerApplicationService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Override
  public CustomerId onboard(OnboardCustomerCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

