package org.BankCalculator.Interfaces;

public interface ICreditCalculator {
    public double CalculateMonthRate(int loan, int months, double interestRate);
    public double TillTheEnd(int loan, int expiredMonths, double interestRate, double rate);
}
