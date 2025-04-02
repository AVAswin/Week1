package UniversityManagementSystem;

// Department class (Composition: owned by University)
class Department {
    String name;
    
    Department(String name) {
        this.name = name;
    }
    
    void display() {
        System.out.println("Department: " + name);
    }
}
