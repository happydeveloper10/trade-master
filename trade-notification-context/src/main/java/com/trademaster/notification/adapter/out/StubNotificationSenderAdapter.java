package com.trademaster.notification.adapter.out;

import com.trademaster.notification.application.port.out.NotificationSendCommand;
import com.trademaster.notification.application.port.out.NotificationSenderPort;

public class StubNotificationSenderAdapter implements NotificationSenderPort {
  @Override
  public void send(NotificationSendCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

