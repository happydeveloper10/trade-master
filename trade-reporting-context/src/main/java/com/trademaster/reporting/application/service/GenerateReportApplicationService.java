package com.trademaster.reporting.application.service;

import com.trademaster.reporting.application.port.in.GenerateReportCommand;
import com.trademaster.reporting.application.port.in.GenerateReportUseCase;
import com.trademaster.reporting.application.port.in.ReportId;

public class GenerateReportApplicationService implements GenerateReportUseCase {
  @Override
  public ReportId generate(GenerateReportCommand command) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

