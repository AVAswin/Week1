import java.util.ArrayList;
import java.util.List;

// Employee class (Exists only within a Department)
class Employee {
    private String name;
    private String role;

    // Constructor
    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Display Employee details
    public void displayEmployee() {
        System.out.println("   - Employee: " + name + " | Role: " + role);
    }
}
