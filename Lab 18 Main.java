// Import the Student class
import school.Student;
public class Main {

    public static void main(String[] args) throws Exception {
        // Assign a value to school_id without creating on object.
        Student.school_id = 20631724;
        // Create 3 Student objects with unique name and id.
        Student student1 = new Student("Alice", "alice@example.com");
        Student student2 = new Student("Bob", "bob@example.com");
        Student student3 = new Student("Charlie", "charlie@example.com");
        // Output the student information using studentInfo()
        System.out.println("Initial Student Information:");
        student1.studentInfo();
        student2.studentInfo();
        student3.studentInfo();
        // Update the school_id
        Student.school_id = 1002;
        // Output the student information again to confirm change.
        System.out.println("Updated Student Information:");
        student1.studentInfo();
        student2.studentInfo();
        student3.studentInfo();
    }
}
