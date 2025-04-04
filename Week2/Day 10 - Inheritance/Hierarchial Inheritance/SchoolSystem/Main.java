package SchoolSystem;

// School System with Hierarchical Inheritance in Java
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Alice", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Brown", 35, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

