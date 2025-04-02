package UniversityManagementSystem;
import java.util.*;

// University class
class University {
    String name;
    private List<Department> departments; // Composition (cannot exist independently)
    private List<Faculty> faculties; // Aggregation (can exist independently)
    
    University(String name) {
        this.name = name;
        faculties = new ArrayList<>();
        departments = new ArrayList<>();
    }
    
    // Adding a department (University owns it)
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }
    
    // Adding a faculty member (Faculty exists independently)
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    
    void display() {
        System.out.println("University: " + name);
        for (Department dept : departments) {
            dept.display();
        }
        for (Faculty faculty : faculties) {
            faculty.display();
        }
    }
    
    // Destructor equivalent in Java is handled by Garbage Collection
    protected void finalize() throws Throwable {
        System.out.println("University " + name + " is being deleted, and all its departments are deleted.");
        super.finalize();
    }
}