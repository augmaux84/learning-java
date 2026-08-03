package finger_exercises.week_1;

import java.util.Scanner;

public class CityRegistration {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("City name: ");
        String cityName = myScanner.nextLine();

        System.out.print("Is it a capital city [true/false]? ");
        // boolean isCapital = Boolean.parseBoolean(myScanner.next());
        String isCapital = myScanner.next();
        if (isCapital.equalsIgnoreCase("true") || isCapital.equalsIgnoreCase("false")) {
            boolean isCapitalBoolean = Boolean.parseBoolean(isCapital);
            if (isCapitalBoolean) {
                System.out.printf("The %s city is a capital.", cityName);
            } else {
                System.out.printf("The %s city isn't a capital", cityName);
            }
        } else {
            System.out.println("Answer not accepted");
        }
    }
}