package json.test;

public class JSONTest {

    private String student;
    private int id;
    private long phone;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Student: " + student + " ID: "+ id + " Phone: " + phone;
    }
}
