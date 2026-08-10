package finger_exercises.week_6.finger_exercise_4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("");
        student.setAge(102);
        student.setGrade(80);

        System.out.println(student.getName());
        if (student.getAge() == 0) { // Implement this structure in Student.java later
            System.out.println("The student's age has not yet been recorded.");
        } else {
            System.out.println(student.getAge());
        }
        System.out.println(student.getGrade());

        student.setName("Augusto");
        student.setAge(17);
        student.setGrade(9.7);

        System.out.println(student.getName());
        if (student.getAge() == 0) { // Implement this structure in Student.java later
            System.out.println("The student's age has not yet been recorded.");
        } else {
            System.out.println(student.getAge());
        }
        System.out.println(student.getGrade());
    }
}
