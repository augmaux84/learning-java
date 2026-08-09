package problem_sets.racing_match_engine;

import java.util.ArrayList;

public class Driver {
    String name;
    String carModel;

    // if instance - default: 5.0
    double rating;
    boolean isAvailable;

    public Driver(String name, String carModel, double rating, boolean isAvailable) {
        this.name = name;
        this.carModel = carModel;
        if (rating < 0 || rating > 5) {
            this.rating = 5.0;
        } else {
            this.rating = rating;
        }
        this.isAvailable = isAvailable;
    }

    public void acceptRide() {
        this.isAvailable = false;
        System.out.printf("%s accepted the ride on the %s.", this.name, this.carModel);
    }
}
