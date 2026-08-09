package finger_exercises.week_5;

public class Car {
    String brand;
    String model;
    int year;

    public Car() {
        brand = "Chevrolet";
        model = "Tracker";
        year = 2026;
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.printf("%s %s : %d", car.brand, car.model, car.year);
    }
}
