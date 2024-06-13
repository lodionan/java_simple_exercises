package EncapsulationExcercise;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double moneyAdded) {
        this.balance += moneyAdded;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }

    public static void main(String[] args) {
        BankAccount bA = new BankAccount(350.50);

        System.out.println("\nYour account balance is: " + bA.balance);
        System.out.println("Then You make a deposit");
        bA.deposit(350.00);
        System.out.println("Now your account balance is: " + bA.balance);
        System.out.println("Then you make a withdraw");
        bA.withdraw(115.40);
        System.out.println("Finally your account balance is: " + bA.balance);
    }
}
