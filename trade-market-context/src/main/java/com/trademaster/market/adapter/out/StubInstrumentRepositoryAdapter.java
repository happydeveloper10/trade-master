package com.trademaster.market.adapter.out;

import com.trademaster.market.application.port.out.InstrumentRepository;
import com.trademaster.market.domain.model.Instrument;
import com.trademaster.market.domain.model.InstrumentId;
import java.util.Optional;

public class StubInstrumentRepositoryAdapter implements InstrumentRepository {
  @Override
  public Optional<Instrument> findById(InstrumentId instrumentId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public void save(Instrument instrument) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

