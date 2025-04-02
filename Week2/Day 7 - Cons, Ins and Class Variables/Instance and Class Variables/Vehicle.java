class Vehicle {
    static int registrationFee = 200;
    private String ownerName;
    private String vehicleName;
    
    Vehicle(String n, String d) {
        ownerName = n;
        vehicleName = d;
    }

    Vehicle(Vehicle c) {
        ownerName = c.ownerName;
        vehicleName = c.vehicleName;
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Name: " + vehicleName);
    }

    public static void updateRegistrationFee(int n) {
        registrationFee = n;
    }
}

