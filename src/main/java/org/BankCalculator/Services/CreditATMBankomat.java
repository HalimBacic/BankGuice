package org.BankCalculator.Services;

import org.BankCalculator.Controls.ATMBankomat;
import org.BankCalculator.Interfaces.ICreditCalculator;

import static java.lang.Math.pow;

public class CreditATMBankomat implements ICreditCalculator {
    @Override
    public double CalculateMonthRate(int loan, int months, double interestRate) {
        System.out.println("User calculate month rate.");
        double value = (interestRate/100)/12;
        return loan * value * pow(1 + value, months) / (pow(1 + value,months)-1);
    }

    @Override
    public double TillTheEnd(int loan, int expiredMonths, double interestRate, double rate) {
        System.out.println("User calculate month rate.");
        return loan * pow((1+interestRate),expiredMonths) - rate/interestRate*((pow((1+interestRate),expiredMonths))-1);
    }
}
