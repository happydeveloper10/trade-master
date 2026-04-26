package com.trademaster.market.application.port.in;

import com.trademaster.market.domain.model.Instrument;
import com.trademaster.market.domain.model.InstrumentId;
import java.util.Optional;

public interface GetInstrumentUseCase {
  Optional<Instrument> getById(InstrumentId instrumentId);
}

