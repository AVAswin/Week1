class Employee {
    public String empID;
    protected String department;
    private int salary;

    Employee(String s1, String d, int s) {
        empID = s1;
        department = d;
        salary = s;
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    public void setSalary(int s) {
        salary = s;
    }
}

class Manager extends Employee {
    Manager(String id, String d, int i) {
        super(id, d, i);
    }
}