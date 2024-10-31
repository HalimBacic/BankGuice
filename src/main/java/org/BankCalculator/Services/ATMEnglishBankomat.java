package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Models.Bankomat;

public class ATMEnglishBankomat implements IBankomat {
    @Override
    public Double RemoveAmount(Bankomat atm, double sum) {
        System.out.println("User take money from ATM.");
        return atm.getAmount()-sum;
    }

    @Override
    public Double AddAmount(Bankomat atm, double sum) {
        System.out.println("Admin need to put money in ATM");
        return atm.getAmount()+sum;
    }

    @Override
    public String WelcomeMessage() {
        return "Welcome user. Feel free to use our ATM";
    }

    @Override
    public String WrongPasswordMessage() {
        return "You input wrong PIN. Please, input pin again.";
    }
}
