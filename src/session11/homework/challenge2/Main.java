package session11.homework.challenge2;

public class Main {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in bank A: " + bankA.getBalance());
        System.out.println("Balance in bank B: " + bankB.getBalance());
        System.out.println("Balance in bank C: " + bankC.getBalance());
    }
}