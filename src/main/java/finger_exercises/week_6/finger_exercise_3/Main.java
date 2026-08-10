package finger_exercises.week_6.finger_exercise_3;

import finger_exercises.week_6.finger_exercise_2.Product;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolder("João");
        bankAccount.setAccountBalance(200);
        System.out.println(bankAccount.getAccountHolder());
        System.out.printf("$%.2f\n", bankAccount.getAccountBalance());
        bankAccount.setAccountHolder("Augusto");
    }
}
