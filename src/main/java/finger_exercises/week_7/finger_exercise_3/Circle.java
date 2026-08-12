package finger_exercises.week_7.finger_exercise_3;

import java.lang.Math;

class Circle extends Form {
    Math math;
    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = pi*(math.pow(radius, 2));
        System.out.println(area);
    }
}
