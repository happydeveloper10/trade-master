package com.trademaster.order.adapter.out;

import com.trademaster.order.application.port.out.OrderRepository;
import com.trademaster.order.domain.model.Order;
import com.trademaster.order.domain.model.OrderId;
import java.util.Optional;

public class StubOrderRepositoryAdapter implements OrderRepository {
  @Override
  public Optional<Order> findById(OrderId orderId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public void save(Order order) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

