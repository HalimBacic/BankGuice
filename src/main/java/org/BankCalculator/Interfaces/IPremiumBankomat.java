package org.BankCalculator.Interfaces;

public interface IPremiumBankomat extends IBankomat{
    String ExchangeRate();
    Boolean ExchangeCurrency(double value, double provision, String currency);
}
