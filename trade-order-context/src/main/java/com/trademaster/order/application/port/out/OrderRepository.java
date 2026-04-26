package com.trademaster.order.application.port.out;

import com.trademaster.order.domain.model.Order;
import com.trademaster.order.domain.model.OrderId;
import java.util.Optional;

public interface OrderRepository {
  Optional<Order> findById(OrderId orderId);

  void save(Order order);
}

