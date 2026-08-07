package finger_exercises.week_3;

import java.util.Scanner;

public class CountdownExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int number = Integer.parseInt(myScanner.nextLine());

        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }
}
