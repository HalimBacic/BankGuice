package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.IBankomat;

public class ATMEnglishBankomat implements IBankomat {
    @Override
    public Double RemoveAmount(double sum) {
        System.out.println("User take money from ATM.");
        return -sum;
    }

    @Override
    public Double AddAmount(double sum) {
        System.out.println("Admin need to put money in ATM");
        return 0.0;
    }

    @Override
    public String WelcomeMessage() {
        return "Welcome user. Feel free to use our ATM";
    }

    @Override
    public String WrongPasswordMessage() {
        return "You input wrong PIN. Please, input pin again.";
    }

    @Override
    public void SetLanguage(String lng) {

    }
}
