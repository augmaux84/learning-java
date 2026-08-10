package finger_exercises.week_6.finger_exercise_6;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setName(Address newAddress) {
        this.address = newAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddressCity() {
        return address.getCity();
    }

    public String getAddressStreet() {
        return address.getStreet();
    }

    public int getAddressNumber() {
        return address.getNumber();
    }
}
