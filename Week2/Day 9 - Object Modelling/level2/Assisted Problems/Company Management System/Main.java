import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate Composition
public class Main {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("TechCorp");

        // Add Departments
        company.addDepartment("Engineering");
        company.addDepartment("HR");

        // Add Employees to Departments
        company.addEmployeeToDepartment("Engineering", "Alice", "Software Engineer");
        company.addEmployeeToDepartment("Engineering", "Bob", "DevOps Engineer");
        company.addEmployeeToDepartment("HR", "Charlie", "HR Manager");

        // Display Company details
        company.displayCompany();

        // Delete Company (Simulates Composition: All Departments and Employees are deleted)
        company.deleteCompany();
    }
}
