package finger_exercises.week_6.finger_exercise_7;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Augusto",1235678909);
        Account clientAccount = new Account(1, 340.50, client);

        System.out.println(clientAccount.getClientName());
        System.out.println(clientAccount.getClientCpf());

        clientAccount.sake(341);
        clientAccount.deposit(-1);

        clientAccount.sake(12);
        clientAccount.deposit(9);

        System.out.println(clientAccount.getBalance());
    }
}