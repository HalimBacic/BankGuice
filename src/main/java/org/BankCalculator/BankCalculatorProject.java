package org.BankCalculator;

import org.BankCalculator.Controls.ATMBankomat;
import org.BankCalculator.Controls.ATMBetterBankomat;
import org.BankCalculator.Controls.BankCalculator;
import org.BankCalculator.Controls.SimpleCredit;
import org.BankCalculator.Settings.AppConfig;

public class BankCalculatorProject {
    public static void main(String []args)
    {
        AppConfig.Initialize();
        System.out.println("Bank calculator started...");
        BankCalculator bankCalculator = AppConfig.GetBankCalculatorInstance();
        ATMBetterBankomat betterbankomat = AppConfig.GetATMBetterBankomat();
        ATMBankomat bankomat = AppConfig.GetATMBankomat();
        SimpleCredit simpleCredit = AppConfig.GetSimpleCredit();
    }
}
