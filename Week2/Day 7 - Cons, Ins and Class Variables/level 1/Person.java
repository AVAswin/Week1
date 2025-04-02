class Person {
    static int totalPersons = 0;
    private String name;
    private int age;
    private char gender;

    Person() {
        name = "";
        age = 0;
        gender = ' ';
        totalPersons++;
    }

    Person(String n, int a, char g) {
        name = n;
        age = a;
        gender = g;
        totalPersons++;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
        gender = p.gender;
        totalPersons++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void calculateTotalPersons() {
        System.out.println("Total persons: " + totalPersons);
    }
}
