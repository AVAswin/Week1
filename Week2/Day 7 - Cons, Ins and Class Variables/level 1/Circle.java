class Circle {
    static int totalCircles = 0;
    double radius;
    double area;
    double circumference;

    Circle() {
        radius = 0.0;
        area = 0.0;
        circumference = 0.0;
        totalCircles++;
    }

    Circle(double r) {
        radius = r;
        calculateArea();
        calculateCircumference();
        totalCircles++;
    }

    Circle(Circle c) {
        radius = c.radius;
        calculateArea();
        calculateCircumference();
        totalCircles++;
    }

    public void calculateArea() {
        area = 3.14 * radius * radius;
    }

    public void calculateCircumference() {
        circumference = 2.0 * 3.14 * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void totalCirclesCreated() {
        System.out.println("Total Circles created: " + totalCircles);
    }
}
