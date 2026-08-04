package problem_sets.credit_analysis_engine;

import java.util.Scanner;

public class CreditAnalysisApp {
    // public static void menu() {...} - using switch-case

    public static void validation(Double userMonthlyIncome, String userName) {
        if (userMonthlyIncome >= 15000) {
            System.out.printf("Hello, %s! Itaú Personnalité account activated!", userName);
        } else if (userMonthlyIncome >= 5000) {
            System.out.printf("Hello, %s! Itaú Uniclass account activated!", userName);
        } else {
            System.out.printf("Hello, %s! Itaú Varejo account activated!", userName);
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your full name? ");
        String userName = myObj.next();

        System.out.print("How old are you? ");
        int userAge = Integer.parseInt(myObj.next());

        System.out.print("What is your monthly income? $");
        double userMonthlyIncome = myObj.nextDouble();

        // if String -> boolean
        System.out.printf("%s, do you have any negative records with SPC/Serasa [true/false]? ", userName); // true/false -> y/n
        boolean userRestriction = myObj.nextBoolean();

        if (!userRestriction && (userAge >= 18)) {
            validation(userMonthlyIncome, userName);
        } else if (userRestriction) {
            System.out.printf("%s, you have a negative credit history with Serasa/SPC and cannot access your Itaú account.", userName);
        } else {
            System.out.printf("%s, are you an emancipated client [true/false]? ", userName); // true/false -> y/n

            // if String -> boolean
            boolean isEmancipatedClient = myObj.nextBoolean();

            if (isEmancipatedClient) {
                validation(userMonthlyIncome, userName);
            } else {
                System.out.printf("%s, you cannot access your Itaú account because you are under 18 and not an emancipated client.", userName);
            }
        }

        // edge cases - negative income and impossible age
    }
}