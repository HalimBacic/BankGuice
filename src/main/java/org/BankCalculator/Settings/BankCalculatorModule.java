package org.BankCalculator.Settings;

import com.google.inject.AbstractModule;
import org.BankCalculator.Interfaces.ICreditCalculator;
import org.BankCalculator.Services.CreditCalculator;

public class BankCalculatorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ICreditCalculator.class).to(CreditCalculator.class);
    }
}
