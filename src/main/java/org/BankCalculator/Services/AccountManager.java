package org.BankCalculator.Services;

import org.BankCalculator.Interfaces.IAccountManager;
import org.BankCalculator.Interfaces.IDbOperations;
import org.BankCalculator.Models.Account;

import java.util.UUID;

public class AccountManager implements IAccountManager, IDbOperations<Account> {

    @Override
    public Boolean RemoveFromAccount(UUID uuid, double sum) {
        return null;
    }

    @Override
    public Boolean AddToAccount(UUID uuid, double sum) {
        return null;
    }

    @Override
    public Account Get(UUID uuid) {
        return null;
    }

    @Override
    public Account Update(Account element) {
        return null;
    }
}
