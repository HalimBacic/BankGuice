package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.ICreditCalculator;

import static java.lang.Math.pow;

public class FixCreditCalculator implements ICreditCalculator {
    @Override
    public double CalculateMonthRate(int loan, int months, double interestRate) {
        //Just for testing dependency injection
        interestRate = 6.99;
        double value = (interestRate/100)/12;
        return loan * value * pow(1 + value, months) / (pow(1 + value,months)-1);
    }

    @Override
    public double TillTheEnd(int loan, int expiredMonths, double interestRate, double rate) {
        //Just for testing dependency injection
        interestRate = 6.99;
        return loan * pow((1+interestRate),expiredMonths) - rate/interestRate*((pow((1+interestRate),expiredMonths))-1);
    }
}
