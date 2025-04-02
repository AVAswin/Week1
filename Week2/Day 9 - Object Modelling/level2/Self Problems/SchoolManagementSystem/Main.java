package SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        School school1 = new School("XYZ High School");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        school1.addStudent(s1);
        school1.addStudent(s2);
        school1.addStudent(s3);

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("Computer");
        school1.addCourse(c1);
        school1.addCourse(c2);
        school1.addCourse(c3);

        s1.enroll(c1);  
        s2.enroll(c2);  
        s2.enroll(c1);  
        s3.enroll(c2);  

        c3.addStudent(s1);
        c3.addStudent(s2);

        school1.showStudents();
        school1.showCourses();

        s1.showCourses();
        s2.showCourses();
        s3.showCourses();

        c1.showStudents();
        c2.showStudents();
        c3.showStudents();
    }
}
