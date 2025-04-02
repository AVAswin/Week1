import java.util.ArrayList;
import java.util.List;

// Company class (Contains Departments - Composition)
class Company {
    private String companyName;
    private List<Department> departments; // Composition: A Company owns multiple Departments

    // Constructor
    Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add a new Department
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Add Employee to a Department
    public void addEmployeeToDepartment(String deptName, String empName, String role) {
        for (Department dept : departments) {
            if (deptName.equals(deptName)) {
                dept.addEmployee(empName, role);
                return;
            }
        }
        System.out.println("Department " + deptName + " not found.");
    }

    // Display Company details
    public void displayCompany() {
        System.out.println("\nCompany: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }

    // Destructor-like behavior (To simulate deletion of Company)
    public void deleteCompany() {
        departments.clear(); // Deleting all Departments also deletes all Employees
        System.out.println("\nCompany " + companyName + " and all associated Departments and Employees have been deleted.");
    }
}
