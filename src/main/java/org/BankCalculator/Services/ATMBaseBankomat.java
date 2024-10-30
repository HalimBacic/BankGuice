package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.IBankomat;

public class ATMBaseBankomat implements IBankomat {
    @Override
    public Double RemoveAmount(double sum) {
        System.out.println("Korisnik uzima novce sa bankomata ");
        return -sum;
    }

    @Override
    public Double AddAmount(double sum) {
        System.out.println("Administrator dodaje novce na bankomat ");
        return sum;
    }

    @Override
    public String WelcomeMessage() {
        return "Welcome - Dobrodosli";
    }

    @Override
    public String WrongPasswordMessage() {
        return "Wrong PIN - Pogresan PIN";
    }

    @Override
    public void SetLanguage(String lng) {
        System.out.println("Selected "+lng);
    }
}
