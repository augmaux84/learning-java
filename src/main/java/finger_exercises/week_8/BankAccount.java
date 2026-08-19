package finger_exercises.week_8;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double value) {
        this.balance = value;
    }
    
    public void withdrawal(double value) throws IllegalArgumentException {
        if (value <= 0) {
            throw new IllegalArgumentException("Amount less than or equal to 0.\n");
        } else if (value > this.balance) {
            throw new IllegalArgumentException("Amount greater than the balance.\n");
        } else {
            this.balance -= value;
            System.out.printf("Balance after $%.2f withdrawal: $%.2f\n", value, this.balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount(50);

        // first test
        try {
            bankAccount.withdrawal(-15);
        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }

        // second test
        try {
            bankAccount.withdrawal(150);
        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }

        // third test
        try {
            bankAccount.withdrawal(40);
        } catch (IllegalArgumentException e) {
            System.out.printf(e.getMessage());
        }

        scanner.close();
    }
}
