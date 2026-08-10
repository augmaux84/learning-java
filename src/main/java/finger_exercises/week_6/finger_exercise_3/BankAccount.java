package finger_exercises.week_6.finger_exercise_3;

public class BankAccount {
    private String accountHolder;
    private double accountBalance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountHolder(String newAccountHolder) {
        if (this.accountHolder == null) {
            this.accountHolder = newAccountHolder;
        } else {
            System.out.println("Invalid Data.\n");
        }
    }

    public void setAccountBalance(double newAccountBalance) {
        if (newAccountBalance < 0) {
            System.out.println("Invalid Data.\n");
        } else {
            this.accountBalance = newAccountBalance;
        }
    }
}
