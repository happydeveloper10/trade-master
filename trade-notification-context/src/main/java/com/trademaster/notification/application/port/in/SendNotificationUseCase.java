package com.trademaster.notification.application.port.in;

public interface SendNotificationUseCase {
  void send(SendNotificationCommand command);
}

