import java.util.*;

class Circle {
    private double radius;
    private double area;
    private double circumference;

    Circle(double r) {
        radius = r;
        calculateArea();
        calculateCircumference();
    }

    public void calculateArea() {
        area = 3.14 * radius * radius;
    }

    public void calculateCircumference() {
        circumference = 2.0 * 3.14 * radius;
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }

    public void displayCircumference() {
        System.out.println("Circumference: " + circumference);
    }
}


