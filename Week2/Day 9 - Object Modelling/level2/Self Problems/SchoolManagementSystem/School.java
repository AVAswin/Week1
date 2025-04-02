package SchoolManagementSystem;

import java.util.*;

class School {
    private String schoolName;
    private List<Student> students;
    private List<Course> courses;

    public School(String name) {
        this.schoolName = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showStudents() {
        System.out.print("School " + schoolName + " has students: ");
        for (Student student : students) {
            System.out.print(student.getName() + ", ");
        }
        System.out.println();
    }

    public void showCourses() {
        System.out.print("School " + schoolName + " has courses: ");
        for (Course course : courses) {
            System.out.print(course.getCourseName() + ", ");
        }
        System.out.println();
    }
}
