package com.trademaster.order.application.port.in;

import com.trademaster.order.domain.model.OrderId;

public interface SubmitOrderUseCase {
  OrderId submit(SubmitOrderCommand command);
}

