package finger_exercises.week_6.finger_exercise_5;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("")) {
            System.out.println("Invalid Data");
        } else {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid Data");
        } else {
            this.price = price;
        }
    }
}
