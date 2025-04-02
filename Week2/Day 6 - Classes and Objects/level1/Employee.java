import java.util.*;

class Employee {
    private String name;
    private int id;
    private int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

