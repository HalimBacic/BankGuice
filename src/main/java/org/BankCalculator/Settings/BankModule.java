package org.BankCalculator.Settings;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
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
        bind(ICreditCalculator.class).annotatedWith(Names.named("DefinedCredit")).to(CreditCalculator.class);
        bind(ICreditCalculator.class).annotatedWith(Names.named("FixCredit")).to(FixCreditCalculator.class);
        /* Check what will happen if I wanna use ATMEnglishBankomat*/
        bind(IBankomat.class).annotatedWith(Names.named("BaseBankomat")).to(ATMBaseBankomat.class);
        bind(IBankomat.class).annotatedWith(Names.named("EnglishBankomat")).to(ATMEnglishBankomat.class);
    }
}