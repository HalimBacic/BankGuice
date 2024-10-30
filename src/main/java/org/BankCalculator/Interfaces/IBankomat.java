package org.BankCalculator.Interfaces;

public interface IBankomat {
    public Double RemoveAmount(double sum);
    public Double AddAmount(double sum);
    public String WelcomeMessage();
    public String WrongPasswordMessage();
    public void SetLanguage(String lng);
}
