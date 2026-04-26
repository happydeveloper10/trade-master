package com.trademaster.notification.application.service;

import com.trademaster.notification.application.port.in.SendNotificationCommand;
import com.trademaster.notification.application.port.in.SendNotificationUseCase;
import com.trademaster.notification.application.port.out.NotificationSendCommand;
import com.trademaster.notification.application.port.out.NotificationSenderPort;

public class SendNotificationApplicationService implements SendNotificationUseCase {
  private final NotificationSenderPort notificationSenderPort;

  public SendNotificationApplicationService(NotificationSenderPort notificationSenderPort) {
    this.notificationSenderPort = notificationSenderPort;
  }

  @Override
  public void send(SendNotificationCommand command) {
    notificationSenderPort.send(new NotificationSendCommand(command.destination(), command.messageKey()));
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

