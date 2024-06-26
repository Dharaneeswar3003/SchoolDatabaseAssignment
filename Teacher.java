
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    //teacher class constructor...
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // Getters and setters for Teacher fields

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

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {

        this.subject = subject;
    }

    //To-String method...

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "; Subject: " + subject;
    }
}
