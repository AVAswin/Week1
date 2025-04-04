package EducationalCourseHierarchy;

// Course Management System with Multilevel Inheritance in Java
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "% (Final Price: $" + finalPrice + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Course basicCourse = new Course("Intro to Programming", 6);
        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 8, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 200, 20);
        
        basicCourse.displayInfo();
        System.out.println();
        onlineCourse.displayInfo();
        System.out.println();
        paidCourse.displayInfo();
    }
}

