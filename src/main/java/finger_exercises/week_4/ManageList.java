package finger_exercises.week_4;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageList {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<String>(5);

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a name: ");
            arrayList.add(myScanner.nextLine());
        }

        System.out.println("Enter another name: ");
        String anotherNumber = myScanner.nextLine();

        // +1 value
        while (true) {
            if (arrayList.contains(anotherNumber)) {
                arrayList.remove(anotherNumber);
            } else {
                System.out.println("The value is not contained in the ArrayList.");
                break;
            }
        }
        System.out.println(arrayList);
    }
}