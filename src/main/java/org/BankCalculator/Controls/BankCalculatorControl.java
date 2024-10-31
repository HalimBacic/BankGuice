package org.BankCalculator.Controls;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.BankCalculator.Interfaces.ICreditCalculator;

public class BankCalculatorControl {
    private ICreditCalculator bankCalculator;

    /*
    Can change from fix to custom credit calculator
     */
    @Inject
    public BankCalculatorControl(@Named("DefinedCredit") ICreditCalculator bankCalculator) {
        this.bankCalculator = bankCalculator;
    }

    public double CalculateMonthRate(int loan, double rate, int months)
    {
        return bankCalculator.CalculateMonthRate(loan, months, rate);
    }

    public double CalculateRemainCredit(int loan, int expiredMonths, double interestRate, double rate)
    {
        return bankCalculator.TillTheEnd(loan,expiredMonths,interestRate,rate);
    }
}
