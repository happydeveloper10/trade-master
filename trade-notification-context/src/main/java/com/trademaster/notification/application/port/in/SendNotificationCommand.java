package com.trademaster.notification.application.port.in;

import java.util.Objects;

public record SendNotificationCommand(String destination, String messageKey) {
  public SendNotificationCommand {
    Objects.requireNonNull(destination, "destination");
    Objects.requireNonNull(messageKey, "messageKey");
  }
}

