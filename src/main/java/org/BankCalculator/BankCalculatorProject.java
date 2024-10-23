package org.BankCalculator;

import org.BankCalculator.Models.BankCalculator;
import org.BankCalculator.Settings.AppConfig;

import java.util.Scanner;

public class BankCalculatorProject {
    public static void main(String []args)
    {
        AppConfig.Initialize();
        System.out.println("Bank calculator started...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loan amount?");
        int loan = scanner.nextInt();
        System.out.println("Interest rate?");
        double rate = scanner.nextDouble();
        System.out.println("Monhts?");
        int months = scanner.nextInt();
        BankCalculator bankCalculator = AppConfig.GetBankCalculatorInstance();
        double monthRate = bankCalculator.CalculateMonthRate(loan,rate,months);
        System.out.println("Monthly rate: "+ monthRate);
    }
}
