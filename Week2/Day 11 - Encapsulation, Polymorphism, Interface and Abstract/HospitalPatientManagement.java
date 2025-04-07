import java.util.ArrayList;
import java.util.List;

// Interface for medical record handling
interface MedicalRecord {
    void addRecord(String record); 
    void viewRecords();            
}

// Abstract class for patients
abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;

    // Encapsulated sensitive data
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract billing method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        viewRecords();
        System.out.println("Total Bill: ₹" + calculateBill());
        System.out.println();
    }

    // MedicalRecord interface methods
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical History:");
        if (medicalHistory.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (String record : medicalHistory) {
                System.out.println("- " + record);
            }
        }
    }
}

// Subclass for admitted patients
class InPatient extends Patient {
    private int daysAdmitted;
    private double roomChargePerDay;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomChargePerDay + 2000; // Includes treatment fee
    }
}

// Subclass for visiting patients
class OutPatient extends Patient {
    private int consultations;
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, int consultations, double consultationFee) {
        super(patientId, name, age);
        this.consultations = consultations;
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultations * consultationFee;
    }
}

// Driver class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create patients
        Patient p1 = new InPatient("P001", "Aarav Mehta", 40, 5, 1500);
        Patient p2 = new OutPatient("P002", "Neha Sharma", 25, 2, 500);

        // Add medical records
        p1.addRecord("Diabetes - Regular monitoring");
        p1.addRecord("Appendix surgery");

        p2.addRecord("General fever - Paracetamol advised");

        // Polymorphic processing
        Patient[] patients = { p1, p2 };
        for (Patient p : patients) {
            p.getPatientDetails();
        }
    }
}
