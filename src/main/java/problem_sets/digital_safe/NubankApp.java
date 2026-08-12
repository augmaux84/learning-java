package problem_sets.digital_safe;

public class NubankApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("José", 8253, 1340.70);
        System.out.printf("$%.2f\n", bankAccount.getBalance());
        // bankAccount.deposit(-50);
        // bankAccount.withdraw(1341);
        bankAccount.deposit(12);
        bankAccount.withdraw(320.53);
        System.out.printf("$%.2f\n", bankAccount.getBalance());
    }
}
