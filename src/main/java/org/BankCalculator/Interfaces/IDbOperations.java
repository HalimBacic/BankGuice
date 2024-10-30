package org.BankCalculator.Interfaces;

import org.BankCalculator.Models.Account;

import java.util.UUID;

public interface IDbOperations<T> {
    public T Get(UUID uuid);
    public T Update(T element);
}
