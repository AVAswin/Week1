// Restaurant Management System - Hybrid Inheritance in Java
package RestaurantManagementSystem;

// Interface Worker
interface Worker {
    void performDuties();
}

// Superclass Person
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Chef class inheriting from Person and implementing Worker
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is cooking " + specialty);
    }
}

// Waiter class inheriting from Person and implementing Worker
class Waiter extends Person implements Worker {
    private int tableNumber;

    public Waiter(String name, int id, int tableNumber) {
        super(name, id);
        this.tableNumber = tableNumber;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving table " + tableNumber);
    }
}

// Main class to test the system
public class Main {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 101, "Italian Cuisine");
        Worker waiter = new Waiter("John", 202, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}
