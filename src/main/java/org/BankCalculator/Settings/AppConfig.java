package org.BankCalculator.Settings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.BankCalculator.Models.BankCalculator;

public class AppConfig {
    private static Injector injector;

    public static void Initialize()
    {
        injector = Guice.createInjector(new BankCalculatorModule());
    }

    public static BankCalculator GetBankCalculatorInstance()
    {
        return injector.getInstance(BankCalculator.class);
    }

}
