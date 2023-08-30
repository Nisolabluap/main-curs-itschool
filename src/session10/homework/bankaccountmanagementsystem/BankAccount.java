package session10.homework.bankaccountmanagementsystem;

import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private UUID accountNumber;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = UUID.randomUUID();
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
        return balance;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public void transferFunds(BankAccount targetAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            this.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Funds transferred successfully.");
        } else {
            System.out.println("Insufficient funds or invalid amount for transfer.");
        }
    }
}