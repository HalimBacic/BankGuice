package org.BankCalculator.Controls;

import org.BankCalculator.Services.FixCreditCalculator;

public class SimpleCredit {
    private FixCreditCalculator creditCalculator;

    public SimpleCredit(FixCreditCalculator creditCalculator)
    {
        this.creditCalculator = creditCalculator;
    }

    public Double MonthRate(int loan, int months,double interestRate)
    {
        return creditCalculator.CalculateMonthRate(loan,months,interestRate);
    }

    public Double CalculateToEnd(int loan, int expired, double rate, double monthRate)
    {
        return creditCalculator.TillTheEnd(loan, expired, rate, monthRate);
    }
}
