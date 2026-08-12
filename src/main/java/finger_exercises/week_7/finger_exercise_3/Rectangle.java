package finger_exercises.week_7.finger_exercise_3;

public class Rectangle extends Form{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length*width;
        System.out.println(area);
    }
}
