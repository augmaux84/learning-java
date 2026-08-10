package finger_exercises.week_6.finger_exercise_1;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name; // it can simply be 'name'
    }

    public void setName(String newName) {
        this.name = newName; // it can simply be 'name = newName'
    }

    public int getAge() {
        return this.age; // // it can simply be 'age'
    }

    public void setAge(int newAge) {
        if (newAge < 0 || newAge > 120) {
            System.out.println("Invalid Data.");
        } else {
            this.age = newAge; // it can simply be 'age = newAge'
        }
    }
}
