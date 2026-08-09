package finger_exercises.week_5;

public class BankAccount {
    String holder;
    int number;
    double balance;

    public BankAccount(String holder, int number, double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount firstBankAccount = new BankAccount("Augusto", 84, 340.50);
        BankAccount secondBankAccount = new BankAccount("Joana", 7, 20);
        BankAccount thirdBankAccount = new BankAccount("João", 8, 24);

        System.out.printf("%s (%d) - $%.2f\n", firstBankAccount.holder, firstBankAccount.number, firstBankAccount.balance);
        System.out.printf("%s (%d) - $%.2f\n", secondBankAccount.holder, secondBankAccount.number, secondBankAccount.balance);
        System.out.printf("%s (%d) - $%.2f\n", thirdBankAccount.holder, thirdBankAccount.number, thirdBankAccount.balance);
    }
}
