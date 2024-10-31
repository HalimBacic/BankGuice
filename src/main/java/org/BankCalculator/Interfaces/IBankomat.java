package org.BankCalculator.Interfaces;

import org.BankCalculator.Models.Bankomat;

public interface IBankomat {
    public Double RemoveAmount(Bankomat atm, double sum);
    public Double AddAmount(Bankomat atm, double sum);
    public String WelcomeMessage();
    public String WrongPasswordMessage();
}
