package finger_exercises.week_6.finger_exercise_4;

public class Student {
    private String name = "";
    private int age;
    private double grade;

    public void setName(String newName) {
        if (newName.equalsIgnoreCase("")) {
            System.out.println("Invalid Data.");
        } else if (this.name.isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("The student's name is already registered.");
        }
    }

    public void setAge(int newAge) {
        if (newAge < 5 || newAge > 100) {
            System.out.println("Invalid Data.");
        } else {
            this.age = newAge;
        }
    }

    public void setGrade(double newGrade) {
        if (newGrade < 0 || newGrade > 10) {
            System.out.println("Invalid Data.");
        } else {
            this.grade = newGrade;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

}
