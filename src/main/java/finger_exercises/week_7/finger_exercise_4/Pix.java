package finger_exercises.week_7.finger_exercise_4;

public class Pix implements Payment {
    public void pay(double value) {
        System.out.printf("Payment made via Pix ($ %.2f)\n", value);
    }
}
