package com.trademaster.notification.application.port.out;

public interface NotificationSenderPort {
  void send(NotificationSendCommand command);
}

