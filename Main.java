import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        School LordByngSecondary = new School("Lord Byng Secondary", "Point Grey", 1500);

        // Print the school details
        System.out.println("School details: \nSchool Name: " + LordByngSecondary.getSchoolName() +
                "\nArea/Catchment: " + LordByngSecondary.getschoolArea() +
                "\nNumber of Students: " + LordByngSecondary.getnumofStudents());
        System.out.println("-----------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String n = String.valueOf(i + 1); // n takes the place of last name
            Student student = new Student("Student", n, 8); // Create a new Student object
            LordByngSecondary.addStudent(student); // Add the student to the school
            students.add(student); // Add the student to the students ArrayList
        }

        for (int i = 0; i < 3; i++) {
            String n = String.valueOf(i + 1); // n takes the place of last name
            Teacher teacher = new Teacher("Teacher", n, "Subject " + n); // Create a new Teacher object
            LordByngSecondary.addTeacher(teacher); // Add the teacher to the school
            teachers.add(teacher); // Add the teacher to teachers ArrayList
        }

        LordByngSecondary.showAllTeachers(); // Display all teachers in the school
        System.out.println("______________________________________________________");
        LordByngSecondary.showAllStudents(); // Display all students in the school
        System.out.println("______________________________________________________");

        // Removing two students and one teacher
        if (students.size() >= 2) {
            LordByngSecondary.deleteStudent(students.get(0)); // Remove a student from the school
            students.remove(0); // Remove the student from the local students ArrayList (optional)
            LordByngSecondary.deleteStudent(students.get(0)); // Remove another student from the school
            students.remove(0); // Remove the student from the local students ArrayList (optional)
        }

        System.out.println("School Database after removing two students and one teacher:");
        System.out.println("______________________________________________________");

        if (teachers.size() >= 1) {
            LordByngSecondary.deleteTeacher(teachers.get(0)); // Remove a teacher from the school
            teachers.remove(0); // Remove the teacher from the teachers ArrayList
        }

        LordByngSecondary.showAllTeachers(); // Display remaining teachers in the school
        System.out.println("______________________________________________________");
        LordByngSecondary.showAllStudents(); // Display remaining students in the school
    }
}
