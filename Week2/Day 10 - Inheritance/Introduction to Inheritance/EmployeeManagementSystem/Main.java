package EmployeeManagementSystem;

class Employee {
    private String name;
    private String id;
    private int salary;

    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public void getName() {
        System.out.println("Name: " + name);
    }

    public void getId() {
        System.out.println("ID: " + id);
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String n, String id, int s, int t) {
        super(n, id, s);
        teamSize = t;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String n, String id, int s, String p) {
        super(n, id, s);
        programmingLanguage = p;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int daysJoined;
    Intern(String n, String id, int s, int d) {
        super(n, id, s);
        daysJoined = d;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Days Joined: " + daysJoined);
    }
}

class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Aswin", "121", 20000, 20);
        manager.displayDetails();

        Developer developer = new Developer("Austin", "122", 30000, "Java");
        developer.displayDetails();

        Intern intern = new Intern("Mike", "123", 10000, 20);
        intern.displayDetails();
    }
}
