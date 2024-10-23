package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.ICreditCalculator;

import static java.lang.Math.pow;

public class CreditCalculator implements ICreditCalculator {
    @Override
    public double CalculateMonthRate(int loan, double interestRate, int months) {
        double value = (interestRate/100)/12;
        return loan * value * pow(1 + value, months) / (pow(1 + value,months)-1);
    }
}