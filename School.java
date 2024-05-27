
import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private String schoolName;
    private String schoolArea;
    private int numofStudents;

    //New school class contructor...
    public School(String schoolName, String schoolArea, int numofStudents) {
        this.schoolName = schoolName;
        this.schoolArea = schoolArea;
        this.numofStudents = numofStudents;
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Getters and setters...
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getnumofStudents() {
        return numofStudents;
    }

    public void setnumofStudents(int numofStudents) {
        this.numofStudents = numofStudents;
    }

    public String getschoolArea() {
        return schoolArea;
    }

    public void setschoolArea(String schoolArea) {
        this.schoolArea = schoolArea;
    }

    // Method to add a teacher...
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    // Method to add a student..
    public void addStudent(Student student) {
        students.add(student);
    }
    // Method to remove a teacher...
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }
    // Method to remove a student...
    public void deleteStudent(Student student) {
        students.remove(student);
    }
    // Method to show all teachers...
    public void showAllTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    // Method to show all students...
    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}