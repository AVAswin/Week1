import java.util.ArrayList;
import java.util.List;

// Department class (Exists only within a Company)
class Department {
    private String departmentName;
    private List<Employee> employees; // Composition: A Department has Employees

    // Constructor
    Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add an Employee to the Department
    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    // Display Department details
    public void displayDepartment() {
        System.out.println(" - Department: " + departmentName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}


