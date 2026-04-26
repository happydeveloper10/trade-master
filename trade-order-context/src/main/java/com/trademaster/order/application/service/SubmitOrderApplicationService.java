package com.trademaster.order.application.service;

import com.trademaster.order.application.port.in.SubmitOrderCommand;
import com.trademaster.order.application.port.in.SubmitOrderUseCase;
import com.trademaster.order.application.port.out.OrderRepository;
import com.trademaster.order.domain.model.OrderId;

public class SubmitOrderApplicationService implements SubmitOrderUseCase {
  private final OrderRepository orderRepository;

  public SubmitOrderApplicationService(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public OrderId submit(SubmitOrderCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

