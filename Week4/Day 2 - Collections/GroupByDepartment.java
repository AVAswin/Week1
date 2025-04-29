import java.util.*;
import java.util.stream.Collectors;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    // override equals and hashCode for correct grouping in Map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee {
    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = Arrays.asList(
            new Employee("Alice", hr),
            new Employee("Bob", it),
            new Employee("Carol", hr)
        );

        Map<Department, List<Employee>> grouped =
            employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        // Print grouped map
        for (Map.Entry<Department, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
