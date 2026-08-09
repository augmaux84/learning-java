package finger_exercises.week_5;

public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Augusto";
        person.age = 17;

        System.out.printf("%s : %d y", person.name, person.age);
    }
}
