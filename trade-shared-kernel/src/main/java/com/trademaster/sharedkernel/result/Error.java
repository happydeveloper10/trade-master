package com.trademaster.sharedkernel.result;

import java.util.Objects;

public record Error(String code, String message) {
  public Error {
    Objects.requireNonNull(code, "code");
    Objects.requireNonNull(message, "message");
  }
}

