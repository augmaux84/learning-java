package finger_exercises.week_3;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);

       System.out.println("Digite um número inteiro: ");
       int number = Integer.parseInt(myScanner.nextLine());

       for (int i=1; i<=number; i++) {
           if (i % 2 == 0) {
               System.out.println(i);
           }
       }
    }
}
