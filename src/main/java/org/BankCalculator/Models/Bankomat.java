package org.BankCalculator.Models;

import java.time.LocalDateTime;
import java.util.Random;

public class Bankomat {
    private Double amount;
    private String lang;
    private LocalDateTime time;
    private String adminPin;

    public Bankomat()
    {
        this.amount = 3000.00;
        this.lang = "ENG";
        this.time = LocalDateTime.now();
        Random rand = new Random();
        int randomPin = 1000 + rand.nextInt(8999);
        this.adminPin = Integer.toString(randomPin);
    }

    public Bankomat(LocalDateTime time, String lang, Double amount, String adminPin) {
        this.time = time;
        this.lang = lang;
        this.amount = amount;
        this.adminPin = adminPin;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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


    public String getAdminPin() {
        return adminPin;
    }

    public void setAdminPin(String adminPin) {
        this.adminPin = adminPin;
    }
}
