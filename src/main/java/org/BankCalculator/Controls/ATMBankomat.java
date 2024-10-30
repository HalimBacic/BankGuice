package org.BankCalculator.Controls;

import org.BankCalculator.Interfaces.IBankomat;

import java.time.LocalDateTime;

public class ATMBankomat {
    private Double amount;
    private String lang;
    private LocalDateTime time;
    private IBankomat bankomat;
    
    public ATMBankomat(IBankomat bankomat)
    {
        this.bankomat = bankomat;
    }

    public ATMBankomat(String lang) {
        this.lang = lang;
        amount = 1500.00;
        time = LocalDateTime.now();
    }

    public Double getAmount() {
        return amount;
    }

    /*
    * Amount is user input which will be taken from ATM
    * */
    public void setAmount(Double amount) {
        this.amount += bankomat.RemoveAmount(amount);
    }

    public void addAmount(Double amount)
    {
        this.amount += bankomat.AddAmount(amount);
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
