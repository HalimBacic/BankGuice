package org.BankCalculator.Settings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.BankCalculator.Controls.*;

public class AppConfig {
    private static Injector injector;

    public static void Initialize()
    {
        injector = Guice.createInjector(new BankModule());
    }

    public static BankCalculatorControl GetBankCalculatorInstance()
    {
        return injector.getInstance(BankCalculatorControl.class);
    }

    public static ATMBetterBankomatControl GetATMBetterBankomat()
    {
        /*
        * See what will happen if change return type of argument in getInstance
        * */
        return injector.getInstance(ATMBetterBankomatControl.class);
    }

    public static ATMBankomatControl GetATMBankomat()
    {
        return injector.getInstance(ATMBankomatControl.class);
    }

    public static ATMEnglishControl GetATMEnglishBankomat()
    {
        return injector.getInstance(ATMEnglishControl.class);
    }

    public static SimpleCreditControl GetSimpleCredit()
    {
        /*
        * Check what will happen after changes in Module
        * Check what will happen after add two modules with similar settings
        * */
        return injector.getInstance(SimpleCreditControl.class);
    }
}