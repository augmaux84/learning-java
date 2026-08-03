package finger_exercises.week_1;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Width: ");
        // String widthText = scanner1.nextLine();
        // double widthNumber = Double.parseDouble(widthText);
        double width = Double.parseDouble(scanner1.nextLine());

        System.out.println("Length: ");
        // String lengthText = scanner1.nextLine();
        // double lengthNumber =  Double.parseDouble(lengthText);
        double length = Double.parseDouble(scanner1.nextLine());

        Double area = width*length;
        // Double area = widthNumber*lengthNumber;

        System.out.println(area);
    }
}
