package problem_sets.digital_safe;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Data.");
        } else {
            this.balance = this.balance + amount;

        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance || amount <= 0) {
            System.out.println("Insufficient balance or invalid data.");
        } else {
            this.balance = this.balance - amount;
        }
    }

}
