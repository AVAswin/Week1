import java.util.*;

// Abstract base class
abstract class JobRole {
    abstract String getRequiredSkills();
}

// Subclasses for specific roles
class SoftwareEngineer extends JobRole {
    @Override
    String getRequiredSkills() {
        return "Java, Data Structures, Algorithms";
    }
}

class DataScientist extends JobRole {
    @Override
    String getRequiredSkills() {
        return "Python, Machine Learning, Statistics";
    }
}

class ProductManager extends JobRole {
    @Override
    String getRequiredSkills() {
        return "Communication, Product Strategy, Market Research";
    }
}

// Generic Resume class with bounded type
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + candidateName);
        System.out.println("Required skills: " + jobRole.getRequiredSkills());
    }

    public T getJobRole() {
        return jobRole;
    }
}

// Resume processor using wildcard
class ResumeProcessor {
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            System.out.println("Screening for role: " + role.getClass().getSimpleName());
            System.out.println("Expected skills: " + role.getRequiredSkills());
        }
    }
}

// Main class
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Carol", new ProductManager());

        // Process each resume
        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        // Create list of job roles for bulk screening
        List<JobRole> allRoles = new ArrayList<>();
        allRoles.add(new SoftwareEngineer());
        allRoles.add(new DataScientist());
        allRoles.add(new ProductManager());

        System.out.println("\n--- Screening Pipeline ---");
        ResumeProcessor.screenResumes(allRoles);
    }
}
