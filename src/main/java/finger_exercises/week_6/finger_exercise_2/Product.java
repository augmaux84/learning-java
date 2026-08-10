package finger_exercises.week_6.finger_exercise_2;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice <= 0) {
            System.out.println("Invalid Data.");
        } else {
            price = newPrice;
        }
    }
}