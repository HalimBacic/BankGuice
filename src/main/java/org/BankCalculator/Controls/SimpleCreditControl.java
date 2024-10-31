package org.BankCalculator.Controls;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.BankCalculator.Interfaces.ICreditCalculator;
import org.BankCalculator.Services.FixCreditCalculator;

public class SimpleCreditControl {
    private ICreditCalculator creditCalculator;

    @Inject
    public SimpleCreditControl(@Named("FixCredit") ICreditCalculator creditCalculator)
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
