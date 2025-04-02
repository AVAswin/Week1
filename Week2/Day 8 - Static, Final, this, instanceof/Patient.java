class Patient {
    static String hospitalName;
    static int totalPatients = 0;

    public final String id;
    public String name;
    public int age;
    public String ailment;

    Patient(String id, String n, int age, String a) {
        this.id = id;
        name = n;
        this.age = age;
        ailment = a;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        System.out.println("Patient Details: ");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}
