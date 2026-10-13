package week4;

public class Student {
    private String studentID;
    private String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
    
    public void studentInformation(){
        System.out.println("Name: " + name + " StudentId: " + studentID);
    }
}
