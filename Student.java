
public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    private static int nextStudentNumber = 1;

    //Student class constructor...
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = nextStudentNumber++;
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

    public void setStudentNumber(int i){
        if(!(i >= 10000000) && !(i<1000000)){
            studentNumber = i;
        }else{
            System.out.println("Not a valid student ID");
        }
    }


    //To-String method...

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "; Grade: " + grade + "; Student Number: " + studentNumber;
    }
}

