package problem_sets.racing_match_engine;

public class Driver {
    String name;
    String carModel;
    double rating;
    boolean isAvailable;

    public Driver(String name, String carModel, double rating, boolean isAvailable) {
        this.name = name;
        this.carModel = carModel;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    public static void acceptRide(Driver driver) {
        if (driver.isAvailable) {
            driver.isAvailable = false;
            System.out.printf("%s accepted the ride on the %s", driver.name, driver.carModel);
        } else {
            System.out.printf("The %s driver is not available.", driver.name);
        }
    }
}
