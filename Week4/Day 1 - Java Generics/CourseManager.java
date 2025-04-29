import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through final exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated through research work.");
    }
}

class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public void showAllCourses() {
        for (T course : courseList) {
            System.out.print("Course: " + course.getCourseName() + " - ");
            course.evaluate();
        }
    }
}

class CourseUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.print("Course: " + course.getCourseName() + " - ");
            course.evaluate();
        }
    }
}

public class CourseManager {
    public static void main(String[] args) {
        // Exam Courses
        Course<ExamCourse> examCourseManager = new Course<>();
        examCourseManager.addCourse(new ExamCourse("Math 101"));
        examCourseManager.addCourse(new ExamCourse("Physics 101"));

        // Assignment Courses
        Course<AssignmentCourse> assignmentCourseManager = new Course<>();
        assignmentCourseManager.addCourse(new AssignmentCourse("Literature 201"));
        assignmentCourseManager.addCourse(new AssignmentCourse("Sociology 101"));

        // Research Courses
        Course<ResearchCourse> researchCourseManager = new Course<>();
        researchCourseManager.addCourse(new ResearchCourse("AI Research"));
        researchCourseManager.addCourse(new ResearchCourse("Quantum Computing"));

        // Show all courses
        System.out.println("=== Exam-Based Courses ===");
        examCourseManager.showAllCourses();

        System.out.println("\n=== Assignment-Based Courses ===");
        assignmentCourseManager.showAllCourses();

        System.out.println("\n=== Research-Based Courses ===");
        researchCourseManager.showAllCourses();

        System.out.println("\n=== Using Wildcard Display ===");
        CourseUtils.displayCourses(Arrays.asList(
            new ExamCourse("Economics 101"),
            new AssignmentCourse("History 102"),
            new ResearchCourse("Blockchain Research")
        ));
    }
}
