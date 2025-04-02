package SchoolManagementSystem;

import java.util.*;

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) { // Fix: Check if student is NOT already enrolled
            enrolledStudents.add(student);
        }
        if (!student.getEnrolledCourses().contains(this)) {  
            student.enroll(this); // Ensure the student also enrolls in this course
        }
    }

    public void showStudents() {
        System.out.print("Course " + courseName + " has students: ");
        for (Student student : enrolledStudents) {
            System.out.print(student.getName() + ", ");
        }
        System.out.println();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
