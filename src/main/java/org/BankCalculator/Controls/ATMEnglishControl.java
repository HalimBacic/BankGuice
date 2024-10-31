package org.BankCalculator.Controls;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Models.Bankomat;

public class ATMEnglishControl {
    private Bankomat atm;
    //English service control
    private IBankomat englishService;

    //Different constructor
    @Inject
    public ATMEnglishControl(Bankomat atm, @Named("EnglishBankomat")IBankomat englishService) {
        this.atm = atm;
        this.englishService = englishService;
    }

    public void SayHello()
    {
        System.out.println(englishService.WelcomeMessage());
    }

    public Double TakeMoney(Double sum)
    {
        double value = englishService.RemoveAmount(atm,sum);
        atm.setAmount(atm.getAmount()-value);
        return value;
    }

    public Double AddMoney(Double sum)
    {
        double value = englishService.AddAmount(atm,sum);
        atm.setAmount(atm.getAmount()+value);
        return value;
    }
}
