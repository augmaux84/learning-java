package finger_exercises.week_6.finger_exercise_6;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Rua Salto Veloso", 2084, "Natal");
        Person person = new Person("Augusto", address);

        System.out.println(person.getName());
        System.out.println(person.getAddressStreet());
        System.out.println(person.getAddressNumber());
        System.out.println(person.getAddressCity());
    }
}
