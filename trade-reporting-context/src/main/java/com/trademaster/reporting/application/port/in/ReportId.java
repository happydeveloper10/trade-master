package com.trademaster.reporting.application.port.in;

import com.trademaster.sharedkernel.domain.Identifier;
import java.util.Objects;

public record ReportId(String value) implements Identifier {
  public ReportId {
    Objects.requireNonNull(value, "value");
  }
}

