package com.trademaster.execution.application.service;

import com.trademaster.execution.application.port.in.RouteOrderCommand;
import com.trademaster.execution.application.port.in.RouteOrderUseCase;
import com.trademaster.execution.application.port.out.BrokerGatewayPort;
import com.trademaster.execution.application.port.out.RouteOrderToBrokerCommand;

public class RouteOrderApplicationService implements RouteOrderUseCase {
  private final BrokerGatewayPort brokerGatewayPort;

  public RouteOrderApplicationService(BrokerGatewayPort brokerGatewayPort) {
    this.brokerGatewayPort = brokerGatewayPort;
  }

  @Override
  public void route(RouteOrderCommand command) {
    brokerGatewayPort.route(new RouteOrderToBrokerCommand(command.orderId()));
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

