package session9.homework.simplebankingapplication;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String account;
    private int initialDeposit = 0;
    private int balance;
    private List<String> operationHistory = new ArrayList<>();

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
        balance = initialDeposit;
    }

    public int getBalance() {
        return balance;
    }

    public void setOperation(int operation) {
        if (operation > 0) {
            balance += operation;
            operationHistory.add("Added: " + operation);
        } else if (operation < 0) {
            balance += operation;
            operationHistory.add("Withdrawal: " + operation);
        } else {
            operationHistory.add("Invalid operation: " + operation);
        }
    }

    public List<String> getOperationHistory() {
        return operationHistory;
    }

    @Override
    public String toString() {
        StringBuilder history = new StringBuilder();
        for (String entry : operationHistory) {
            history.append(entry).append("\n");
        }
        return "Account Holder: " + account +
                "\nInitial Deposit: " + initialDeposit +
                "\nCurrent Balance: " + balance +
                "\nOperation History:\n" + history;
    }
}