import java.util.Random;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;

    // Static Random instance to generate random numbers
    private static final Random random = new Random();

    // Student class constructor...
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = generateRandomStudentNumber();
    }

    // Method to generate a random student number
    private int generateRandomStudentNumber() {
        // Generate a random number in the range [1000000, 9999999]
        return 1000000 + random.nextInt(9000000);
    }

    // Getters and setters for Student fields
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 13) {
            this.grade = grade;
        } else {
            System.out.println("Not a valid grade");
        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumber >= 1000000 && studentNumber <= 9999999) {
            this.studentNumber = studentNumber;
        } else {
            System.out.println("Not a valid student ID");
        }
    }

    // To-String method...
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "; Grade: " + grade + "; Student Number: " + studentNumber;
    }
}
