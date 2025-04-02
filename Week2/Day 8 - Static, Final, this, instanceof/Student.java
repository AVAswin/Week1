class Student {
    private static String universityName = "XYZ University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Updated grade for " + name + " (Roll No: " + rollNumber + ") to: " + grade);
        }
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Student Details:");
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("-------------------------");
        }
    }
}

