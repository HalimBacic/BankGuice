package org.BankCalculator.Controls;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Models.Bankomat;

import java.time.LocalDateTime;

public class ATMBankomatControl {

    private Bankomat atm;
    //Should be BASE BANKOMAT
    private IBankomat bankomat;

    @Inject
    public ATMBankomatControl(@Named("BaseBankomat") IBankomat bankomat, Bankomat atm)
    {
        //Make special bankomat
        this.atm = atm;
        this.bankomat = bankomat;
    }

    /*
    * Amount is user input which will be taken from ATM
    * */
    public void TakeMoney(Double amount) {
        bankomat.WelcomeMessage();
        bankomat.RemoveAmount(atm, amount);
    }

    public void AddAmount(Double amount,String pin)
    {
        //TODO: Check pin for admin
        bankomat.AddAmount(atm, amount);
    }
}
