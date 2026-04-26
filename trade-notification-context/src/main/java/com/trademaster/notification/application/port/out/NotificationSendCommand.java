package com.trademaster.notification.application.port.out;

import java.util.Objects;

public record NotificationSendCommand(String destination, String templateKey) {
  public NotificationSendCommand {
    Objects.requireNonNull(destination, "destination");
    Objects.requireNonNull(templateKey, "templateKey");
  }
}

