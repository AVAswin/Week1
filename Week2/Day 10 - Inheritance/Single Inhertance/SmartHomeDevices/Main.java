package SmartHomeDevices;
// Smart Home System in Java

class Device {
    protected String deviceId;
    protected String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T123", "On", 22.5);
        thermostat.displayStatus();
    }
}

