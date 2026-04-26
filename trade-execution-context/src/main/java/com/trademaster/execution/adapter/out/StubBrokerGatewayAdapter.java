package com.trademaster.execution.adapter.out;

import com.trademaster.execution.application.port.out.BrokerGatewayPort;
import com.trademaster.execution.application.port.out.RouteOrderToBrokerCommand;

public class StubBrokerGatewayAdapter implements BrokerGatewayPort {
  @Override
  public void route(RouteOrderToBrokerCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

