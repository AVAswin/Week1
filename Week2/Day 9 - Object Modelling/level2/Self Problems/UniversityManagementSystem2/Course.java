import java.util.*;

class Course {
    String courseName;
    Professor professor;
    List<Student> students;
    
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.enrollCourse(this);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.name : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}
