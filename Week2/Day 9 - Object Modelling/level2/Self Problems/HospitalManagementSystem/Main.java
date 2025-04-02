package HospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        
        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");
        
        Patient john = new Patient("John");
        Patient alice = new Patient("Alice");

        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(john);
        hospital.addPatient(alice);
        
        drSmith.addPatient(john);
        drSmith.addPatient(alice);
        drJones.addPatient(john);

        drJones.displayPatients();
        drSmith.displayPatients();

        john.displayDoctors();
        alice.displayDoctors();
        
        drSmith.consult(john);
        drJones.consult(john);
        drSmith.consult(alice);
    }
}

