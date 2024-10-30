package org.BankCalculator.Interfaces;

import java.util.UUID;

public interface IAccountManager {
    public Boolean RemoveFromAccount(UUID uuid, double sum);
    public Boolean AddToAccount(UUID uuid, double sum);
}
