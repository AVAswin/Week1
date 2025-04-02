class Vehicle {
    static int registrationFee = 100;
    static int totalVehicles = 0;

    public String ownerName;
    public String vehicleType;
    public final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        totalVehicles++;
    }

    static void updateRegistrationFee(int fee) {
        registrationFee = fee;
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Details:");
            System.out.println("Registration Fee: " + registrationFee);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("-------------------------");
        }

    }

    public static void displayTotalVehicles() { 
        System.out.println("Total Vehicles: " + totalVehicles);
    }
}
