package finger_exercises.week_8;

import java.util.Scanner;

public class SecureDivision {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        double n1 = Double.parseDouble(myObj.nextLine());
        double n2 = Double.parseDouble(myObj.nextLine());

//        try {
//            System.out.printf("%.2f", division);
//        } catch (Exception e) {
//            System.out.println("Error: 0 division");
//        }
//        returns Infinity

        if (n2 == 0) {
            System.out.println("Error: 0 division");
        } else {
            double division = n1 / n2;
            System.out.printf("%.2f", division);
        }

        myObj.close();
    }
}
