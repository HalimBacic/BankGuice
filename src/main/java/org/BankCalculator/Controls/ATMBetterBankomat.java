package org.BankCalculator.Controls;

import org.BankCalculator.Services.ATMBaseBankomat;
import org.BankCalculator.Services.CreditATMBankomat;
import org.BankCalculator.Services.FixCreditCalculator;

public class ATMBetterBankomat extends ATMBaseBankomat {

    CreditATMBankomat bankomat;
    FixCreditCalculator fixRate;

    public ATMBetterBankomat(CreditATMBankomat bankomat, FixCreditCalculator fixRate) {
        this.bankomat = bankomat;
        this.fixRate = fixRate;
    }

    @Override
    public String WelcomeMessage() {
        return "Welcome to SupetATM! Feel free to use out ATM!";
    }

    public double CheckRate(int loan, int months, double interestRate)
    {
        return bankomat.CalculateMonthRate(loan,months,interestRate);
    }

    public double CheckBack(int loan, int expired, double interestRate, double rate)
    {
        return fixRate.TillTheEnd(loan,expired,interestRate,rate);
    }
}
