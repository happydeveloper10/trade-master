package com.trademaster.identity.application.port.in;

import com.trademaster.identity.domain.model.CustomerId;

public interface OnboardCustomerUseCase {
  CustomerId onboard(OnboardCustomerCommand command);
}

