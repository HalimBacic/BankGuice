package org.BankCalculator.Controls;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Interfaces.ICreditCalculator;
import org.BankCalculator.Models.Bankomat;
import org.BankCalculator.Services.ATMBaseBankomat;
import org.BankCalculator.Services.CreditATMBankomat;
import org.BankCalculator.Services.FixCreditCalculator;

public class ATMBetterBankomatControl {

    Bankomat cachBankomat;
    ICreditCalculator rateCalculator;
    ICreditCalculator fixRate;
    IBankomat baseForMessage;

    /*
    * Instructions for Guice DI
    * */
    @Inject
    public ATMBetterBankomatControl(@Named("DefinedCredit")ICreditCalculator bankomat, @Named("FixCredit")ICreditCalculator fixRate, @Named("BaseBankomat") IBankomat base, Bankomat cach) {
        this.cachBankomat = cach;
        this.rateCalculator = bankomat;
        this.fixRate = fixRate;
        this.baseForMessage = base;
    }

    public String WelcomeMessage() {
        return baseForMessage.WelcomeMessage();
    }

    public double CheckRate(int loan, int months, double interestRate)
    {
        return rateCalculator.CalculateMonthRate(loan,months,interestRate);
    }

    public double CheckBack(int loan, int expired, double interestRate, double rate)
    {
        return fixRate.TillTheEnd(loan,expired,interestRate,rate);
    }
}
