package problem_sets.racing_match_engine;

import java.util.ArrayList;

public class UberApp {
    public static void main(String[] args) {
        Driver firstDriver = new Driver("Tomás", "Chevrolet Onix", 5.0, false);
        Driver secondDriver = new Driver("José", "Chevrolet Tracker", 5.0, false);
        Driver thirdDriver = new Driver("Augusto", "Fiat Uno", 4.0, false);

        ArrayList<Driver> arrayListDriver = new ArrayList<>();

        arrayListDriver.add(firstDriver);
        arrayListDriver.add(secondDriver);
        arrayListDriver.add(thirdDriver);

        Driver.acceptRide(arrayListDriver);
    }
}
