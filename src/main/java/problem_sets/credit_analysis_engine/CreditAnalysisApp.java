package problem_sets.credit_analysis_engine;

import java.util.Scanner;

public class CreditAnalysisApp {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("What is your name? ");
        String userName = myObj.next();

        System.out.print("How old are you? ");
        int userAge = Integer.parseInt(myObj.next());

        System.out.print("What is your monthly income? ");
        double userMonthlyIncome = Double.parseDouble(myObj.next());

        System.out.print("Do you have any negative records with SPC/Serasa? ");
        boolean userRestriction = Boolean.parseBoolean(myObj.next());


    }
}
