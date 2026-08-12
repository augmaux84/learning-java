package finger_exercises.week_7.finger_exercise_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Developer developer = new Developer();

        employee.toWork();
        manager.toWork();
        developer.toWork();
    }
}
