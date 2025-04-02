class Student {
    public String rollNumber;
    protected String name;
    private int cgpa; // Methods declared as private can't be accessed in subclasses 

    Student(String n, String na, int c) {
        rollNumber = n;
        name = na;
        cgpa = c;
    }

    public void setCGPA(int c) {
        cgpa = c;
    }

    public void getCGPA() {
        System.out.println("CGPA: " + cgpa);
    }
}

class PostGraduateStudent extends Student {
    PostGraduateStudent(String n, String na, int c) {
        super(n, na, c);
    }
}