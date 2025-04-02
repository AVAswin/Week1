package HospitalManagementSystem;
import java.util.*;

class Doctor {
    String name;
    List<Patient> patients;
    
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }
    
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }
    
    public void addPatient(Patient patient) {
        if(!this.getPatients().contains(patient)) {
            patients.add(patient);
        }
        if(!patient.getDoctors().contains(this)) {
            patient.addDoctor(this);
        }
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void displayPatients() {
        System.out.println("Doctor's Name: " + this.name);
        for(Patient p : patients) {
            System.out.println(p.name);
        }
    }
}
