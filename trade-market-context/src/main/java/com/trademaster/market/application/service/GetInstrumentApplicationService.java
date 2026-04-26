package com.trademaster.market.application.service;

import com.trademaster.market.application.port.in.GetInstrumentUseCase;
import com.trademaster.market.application.port.out.InstrumentRepository;
import com.trademaster.market.domain.model.Instrument;
import com.trademaster.market.domain.model.InstrumentId;
import java.util.Optional;

public class GetInstrumentApplicationService implements GetInstrumentUseCase {
  private final InstrumentRepository instrumentRepository;

  public GetInstrumentApplicationService(InstrumentRepository instrumentRepository) {
    this.instrumentRepository = instrumentRepository;
  }

  @Override
  public Optional<Instrument> getById(InstrumentId instrumentId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

