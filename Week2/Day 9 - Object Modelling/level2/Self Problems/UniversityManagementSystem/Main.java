package UniversityManagementSystem;

class Main {
    public static void main(String[] args) {
        // Creating independent faculty members
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");
        
        // Creating a university
        University uni = new University("XYZ University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        
        // Display University details
        uni.display();
        System.out.println("-------------");
        
        // University object is set to null for garbage collection
        uni = null;
        System.gc(); // Suggesting garbage collection (not guaranteed immediately)
        
        // Faculty members still exist
        System.out.println("Faculty members still exist independently:");
        f1.display();
        f2.display();
    }
}
