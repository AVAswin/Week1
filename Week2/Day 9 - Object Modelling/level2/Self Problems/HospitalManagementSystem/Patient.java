package HospitalManagementSystem;
import java.util.*;

class Patient { 
    String name;
    List<Doctor> doctors;
    
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        if(!this.getDoctors().contains(doctor)) {
            doctors.add(doctor);
        }
        if(!doctor.getPatients().contains(this)) {
            doctor.addPatient(this);
        }
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void displayDoctors() {
        System.out.println("Patient's Name: " + this.name);
        for(Doctor d : doctors) {
            System.out.println(d.name);
        }
    }
}
