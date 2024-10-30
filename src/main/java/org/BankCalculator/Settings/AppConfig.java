package org.BankCalculator.Settings;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.BankCalculator.Controls.ATMBankomat;
import org.BankCalculator.Controls.ATMBetterBankomat;
import org.BankCalculator.Controls.BankCalculator;
import org.BankCalculator.Controls.SimpleCredit;

public class AppConfig {
    private static Injector injector;

    public static void Initialize()
    {
        injector = Guice.createInjector(new BankModule());
    }

    public static BankCalculator GetBankCalculatorInstance()
    {
        return injector.getInstance(BankCalculator.class);
    }

    public static ATMBetterBankomat GetATMBetterBankomat()
    {
        /*
        * See what will happen if change return type of argument in getInstance
        * */
        return injector.getInstance(ATMBetterBankomat.class);
    }

    public static ATMBankomat GetATMBankomat()
    {
        return injector.getInstance(ATMBankomat.class);
    }

    public static SimpleCredit GetSimpleCredit()
    {
        /*
        * Check what will happen after changes in Module
        * Check what will happen after add two modules with similar settings
        * */
        return injector.getInstance(SimpleCredit.class);
    }
}