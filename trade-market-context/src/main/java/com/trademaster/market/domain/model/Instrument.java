package com.trademaster.market.domain.model;

import java.util.Objects;

public class Instrument {
  private final InstrumentId instrumentId;

  public Instrument(InstrumentId instrumentId) {
    this.instrumentId = Objects.requireNonNull(instrumentId, "instrumentId");
  }

  public InstrumentId instrumentId() {
    return instrumentId;
  }
}

