package com.trademaster.reporting.application.port.in;

public interface GenerateReportUseCase {
  ReportId generate(GenerateReportCommand command);
}

