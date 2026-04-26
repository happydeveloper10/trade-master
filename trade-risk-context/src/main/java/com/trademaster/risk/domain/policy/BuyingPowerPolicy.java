package com.trademaster.risk.domain.policy;

import com.trademaster.sharedkernel.finance.Money;

public interface BuyingPowerPolicy {
  Money calculate(CalculateBuyingPowerCommand command);
}

