class Student {
    String name;
    String rollNo;
    int subjects;
    int[] marks;

    Student(String n, String r, int s, int[] marks) {
        name = n;
        rollNo = r;
        subjects = marks.length;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("The student has " + subjects + " subjects.");
        for(int i=0;i<subjects;i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
        calculateGrade();
        
    }

    public void calculateGrade() {
        float total = 0;
        for(int i=0;i<subjects;i++) {
            total += marks[i];
        }
        float percentage = total / (float) (subjects);

        if(percentage > 80) {
            System.out.println("Grade A");
        } else if(percentage > 60) {
            System.out.println("Grade B");
        } else if (percentage > 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}