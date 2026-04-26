package com.trademaster.execution.application.port.out;

public interface BrokerGatewayPort {
  void route(RouteOrderToBrokerCommand command);
}

