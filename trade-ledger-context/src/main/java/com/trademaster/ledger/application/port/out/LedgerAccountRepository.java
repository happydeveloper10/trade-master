package com.trademaster.ledger.application.port.out;

import com.trademaster.ledger.domain.model.LedgerAccount;
import com.trademaster.ledger.domain.model.LedgerAccountId;
import java.util.Optional;

public interface LedgerAccountRepository {
  Optional<LedgerAccount> findById(LedgerAccountId ledgerAccountId);

  void save(LedgerAccount ledgerAccount);
}

