package org.BankCalculator.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cardNumber;
    private String username;
    private Double amount;
    private String pin;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account() {
    }


    public UUID getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(UUID cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
