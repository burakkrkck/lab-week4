package week4;
import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseName;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void courseInformation(){
        System.out.println("Course Name: " + courseName + " Capacity" + " Enrolled Students: " + enrolledStudents.size());
        if(enrolledStudents.isEmpty()){
            System.out.println("None: ");
        }
        else{
            System.out.println();
            for(Student s: enrolledStudents){
                s.studentInformation();
            }
        }
    }
}
