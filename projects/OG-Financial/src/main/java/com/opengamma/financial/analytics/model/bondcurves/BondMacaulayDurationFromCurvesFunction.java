/**
 * Copyright (C) 2013 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.financial.analytics.model.bondcurves;

import static com.opengamma.engine.value.ValueRequirementNames.MACAULAY_DURATION;

import com.opengamma.analytics.financial.provider.calculator.issuer.MacaulayDurationFromCurvesCalculator;
import com.opengamma.analytics.financial.provider.description.interestrate.IssuerProviderInterface;
import com.opengamma.core.security.Security;
import com.opengamma.engine.ComputationTarget;
import com.opengamma.engine.function.FunctionCompilationContext;
import com.opengamma.engine.value.ValueRequirementNames;
import com.opengamma.financial.security.bond.BondSecurity;

/**
 * Calculates the Macaulay duration of a bond from yield curves.
 */
public class BondMacaulayDurationFromCurvesFunction extends BondAndBondFutureFromCurvesFunction<IssuerProviderInterface, Double> {

  /**
   * Sets the value requirement name to {@link ValueRequirementNames#MACAULAY_DURATION} and
   * the calculator to {@link MacaulayDurationFromCurvesCalculator}.
   */
  public BondMacaulayDurationFromCurvesFunction() {
    super(MACAULAY_DURATION, MacaulayDurationFromCurvesCalculator.getInstance());
  }

  @Override
  public boolean canApplyTo(final FunctionCompilationContext context, final ComputationTarget target) {
    final Security security = target.getTrade().getSecurity();
    return security instanceof BondSecurity;
  }

}