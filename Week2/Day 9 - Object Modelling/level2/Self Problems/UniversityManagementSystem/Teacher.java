package UniversityManagementSystem;

// Faculty class (Aggregation: can exist independently of University)
class Faculty {
    String name;
    
    Faculty(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Faculty: " + name);
    }
}






