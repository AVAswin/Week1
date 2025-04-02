package SchoolManagementSystem;

import java.util.*;

class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enroll(Course course) {
        if (!enrolledCourses.contains(course)) {  
            enrolledCourses.add(course);  
        }
        if (!course.getEnrolledStudents().contains(this)) {
            course.addStudent(this); // Ensure the course also adds the student
        }
    }

    public void showCourses() {
        System.out.print("Student " + name + " is enrolled in: ");
        for (Course course : enrolledCourses) {
            System.out.print(course.getCourseName() + ", ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}
