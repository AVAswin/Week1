package HospitalManagementSystem;
import java.util.*;

class Hospital {
    List<Doctor> doctors;
    List<Patient> patients;
    
    public Hospital() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}