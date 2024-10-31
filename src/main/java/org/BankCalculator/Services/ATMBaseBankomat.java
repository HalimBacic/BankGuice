package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Models.Bankomat;

public class ATMBaseBankomat implements IBankomat {
    @Override
    public Double RemoveAmount(Bankomat atm, double sum) {
        System.out.println("Korisnik uzima novce sa bankomata ");
        atm.setAmount(atm.getAmount()-sum);
        return atm.getAmount();
    }

    @Override
    public Double AddAmount(Bankomat atm, double sum) {
        System.out.println("Administrator dodaje novce na bankomat ");
        atm.setAmount(atm.getAmount()+sum);
        return atm.getAmount();
    }

    @Override
    public String WelcomeMessage() {
        return "Welcome - Dobrodosli";
    }

    @Override
    public String WrongPasswordMessage() {
        return "Wrong PIN - Pogresan PIN";
    }
}
