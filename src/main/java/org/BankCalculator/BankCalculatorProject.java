package org.BankCalculator;

import org.BankCalculator.Controls.ATMBankomatControl;
import org.BankCalculator.Controls.ATMBetterBankomatControl;
import org.BankCalculator.Controls.BankCalculatorControl;
import org.BankCalculator.Controls.SimpleCreditControl;
import org.BankCalculator.Settings.AppConfig;

public class BankCalculatorProject {
    public static void main(String []args)
    {
        AppConfig.Initialize();
        System.out.println("Bank calculator started...");
        BankCalculatorControl bankCalculator = AppConfig.GetBankCalculatorInstance();
        ATMBetterBankomatControl betterbankomat = AppConfig.GetATMBetterBankomat();
        ATMBankomatControl bankomat = AppConfig.GetATMBankomat();
        SimpleCreditControl simpleCredit = AppConfig.GetSimpleCredit();
        System.out.println("Program finished.");
    }
}
