package finger_exercises.week_6.finger_exercise_7;

public class Account {
    private final int number;
    private double balance;
    private final Client client;

    public Account(int number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println("Invalid Data.");
        } else {
            this.balance = this.balance + deposit;
        }
    }

    public void sake(double sake) {
        if (sake <= 0 || sake > this.balance) {
            System.out.println("Invalid Data.");
        } else {
            this.balance = this.balance - sake;
        }
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return client.getName();
    }

    public int getClientCpf() {
        return client.getCpf();
    }
}