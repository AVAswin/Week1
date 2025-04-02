public class Main {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Professor drSmith = new Professor("Dr. Smith");
        
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");
        
        math.assignProfessor(drSmith);
        math.enrollStudent(alice);
        math.enrollStudent(bob);
        
        physics.enrollStudent(alice);
        
        math.displayCourseInfo();
        physics.displayCourseInfo();
    }
}
