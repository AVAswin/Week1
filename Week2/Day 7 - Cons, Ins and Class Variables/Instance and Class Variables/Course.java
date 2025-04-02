class Course {
    static String instituteName = "SRM";
    private String courseName;
    private int durationInMonths;
    private int fees;
    
    Course(String n, int d, int f) {
        courseName = n;
        durationInMonths = d;
        fees = f;
    }

    Course(Course c) {
        courseName = c.courseName;
        durationInMonths = c.durationInMonths;
        fees = c.fees;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration in Months: " + durationInMonths);
        System.out.println("Fees: " + fees);
    }

    public static void updateInstituteName(String n) {
        instituteName = n;
    }
}
