package com.trademaster.market.application.port.out;

import com.trademaster.market.domain.model.Instrument;
import com.trademaster.market.domain.model.InstrumentId;
import java.util.Optional;

public interface InstrumentRepository {
  Optional<Instrument> findById(InstrumentId instrumentId);

  void save(Instrument instrument);
}

