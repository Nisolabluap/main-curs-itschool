package session9.homework.simplebankingapplication;

public class SimpleBankingApplication {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccount("Paul Balosin");
        account.setOperation(50);
        account.setOperation(-50);
        account.setOperation(250);
        account.setOperation(0);
        account.setOperation(0);
        account.setOperation(0);
        System.out.println(account);

        Account account2 = new Account();
        account2.setAccount("Luap Nisolab");
        account2.setOperation(20);
        account2.setOperation(-50);
        account2.setOperation(25);
        System.out.println(account2);
    }
}