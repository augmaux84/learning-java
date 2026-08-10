package finger_exercises.week_6.finger_exercise_7;

public class Client {
    private final String name;
    private final int cpf;

    public Client(String name, int cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getCpf() {
        return cpf;
    }
}
