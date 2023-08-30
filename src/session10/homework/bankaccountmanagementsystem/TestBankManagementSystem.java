package session10.homework.bankaccountmanagementsystem;

public class TestBankManagementSystem {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Paul");
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);

        bankAccount.printAccountDetails();
        System.out.println("Balance: " + bankAccount.getBalance());

        System.out.println();
        BankAccount bankAccount1 = new BankAccount("Luap");
        BankAccount bankAccount2 = new BankAccount("Alice");

        bankAccount1.deposit(10000);

        bankAccount1.transferFunds(bankAccount2, 999);

        bankAccount1.printAccountDetails();
        System.out.println("Balance: " + bankAccount1.getBalance());

        bankAccount2.printAccountDetails();
        System.out.println("Balance: " + bankAccount2.getBalance());
    }
}