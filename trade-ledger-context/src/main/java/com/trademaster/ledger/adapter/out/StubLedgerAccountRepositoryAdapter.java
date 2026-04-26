package com.trademaster.ledger.adapter.out;

import com.trademaster.ledger.application.port.out.LedgerAccountRepository;
import com.trademaster.ledger.domain.model.LedgerAccount;
import com.trademaster.ledger.domain.model.LedgerAccountId;
import java.util.Optional;

public class StubLedgerAccountRepositoryAdapter implements LedgerAccountRepository {
  @Override
  public Optional<LedgerAccount> findById(LedgerAccountId ledgerAccountId) {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public void save(LedgerAccount ledgerAccount) {
    throw new UnsupportedOperationException("Not implemented yet");
  }
}

