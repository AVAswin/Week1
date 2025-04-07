// Interface for GPS tracking
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract base class
abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = "Unknown";
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: ₹" + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Encapsulated access to rate
    protected double getRatePerKm() {
        return ratePerKm;
    }

    // GPS interface methods
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Car subclass
class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // base fee for car
    }
}

// Bike subclass
class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // no base fee
    }
}

// Auto subclass
class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // small base fee
    }
}

// Main application
public class RideHailingApplication {
    // Polymorphic method
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.updateLocation("Rider's Location");
        vehicle.getVehicleDetails();
        System.out.println("Ride Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("CAR123", "Rahul Sharma", 12);
        Vehicle bike = new Bike("BIKE456", "Priya Verma", 6);
        Vehicle auto = new Auto("AUTO789", "Arjun Singh", 8);

        // Polymorphic fare processing
        processRide(car, 10);
        processRide(bike, 5);
        processRide(auto, 8);
    }
}

