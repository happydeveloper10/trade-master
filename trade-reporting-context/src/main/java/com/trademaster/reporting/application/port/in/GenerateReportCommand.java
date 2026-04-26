package com.trademaster.reporting.application.port.in;

import java.util.Objects;

public record GenerateReportCommand(String reportType) {
  public GenerateReportCommand {
    Objects.requireNonNull(reportType, "reportType");
  }
}

