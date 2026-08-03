package finger_exercises.week_2;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = Integer.parseInt(myScanner.next());

        if (age >= 0 && age < 14) {
            System.out.printf("You are a child, since you are %d years old.", age);
        } else if (age < 18){
            System.out.printf("You are a teenager, since you are %d years old.", age);
        } else if (age < 60) {
            System.out.printf("You are an adult, as you are %d years old.", age);
        } else if (age <= 120 ){
            System.out.printf("You are an older adult, as you are %d years old.", age);
        } else {
            System.out.println("Invalid age.");
        }
    }
}
