package org.BankCalculator.Controls;

import com.google.inject.Inject;
import org.BankCalculator.Interfaces.ICreditCalculator;

public class BankCalculator {
    private ICreditCalculator bankCalculator;

    @Inject
    public BankCalculator(ICreditCalculator bankCalculator) {
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
