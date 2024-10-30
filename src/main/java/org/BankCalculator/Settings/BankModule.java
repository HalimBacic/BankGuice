package org.BankCalculator.Settings;

import com.google.inject.AbstractModule;
import org.BankCalculator.Interfaces.IBankomat;
import org.BankCalculator.Interfaces.ICreditCalculator;
import org.BankCalculator.Services.ATMBaseBankomat;
import org.BankCalculator.Services.ATMEnglishBankomat;
import org.BankCalculator.Services.CreditCalculator;
import org.BankCalculator.Services.FixCreditCalculator;

public class BankModule extends AbstractModule {

    @Override
    protected void configure() {
        /* Will be used @Named for testing to change some of services*/
        bind(ICreditCalculator.class).to(CreditCalculator.class);
        bind(ICreditCalculator.class).to(FixCreditCalculator.class);
        /* Check what will happen if I wanna use ATMEnglishBankomat*/
        bind(IBankomat.class).to(ATMBaseBankomat.class);
        bind(IBankomat.class).to(ATMEnglishBankomat.class);
    }
}