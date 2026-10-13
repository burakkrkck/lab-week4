package week4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Week4 {

    public static void main(String[] args) {
        int a = 0;
        ArrayList Students = new ArrayList();
        List<Course> courses= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you choose Lectures: ");
        int sayi = scan.nextInt();
        for(int i= 0 ; i< sayi;i++){
            System.out.println("Which Course Name and Capacity");
            String course = scan.next();
            int capacity = scan.nextInt();
            courses.add(new Course(course,capacity));
            
            
        }
        while(a<1){
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Register Student");
            System.out.println("2. View All Courses and Enrolled Students");
            System.out.println("3. Exit");
            
            int choice = scan.nextInt();
            
            if(choice == 1){
                System.out.print("\nEnter Student Name: ");
                    String sID = scan.nextLine();
                    System.out.print("Enter Student StudentID: ");
                    String sName = scan.nextLine();
                    System.out.print("Enter the exact name of the course to register: ");
                    String targetCourseName = scan.nextLine();
                    
                    Course foundCourse = null;
                    for (Course c : courses) {
                        if (c.getCourseName().equalsIgnoreCase(targetCourseName)) {
                            foundCourse = c;
                            break;
                        }
                    }

                    if (foundCourse == null) {
                        System.out.println("No course found with that name.\n");
                    } else {
                        
                        if (foundCourse.getEnrolledStudents().size() >= foundCourse.getCapacity()) {
                            System.out.println("This course is full. Registration failed.\n");
                        } else {
                            
                            boolean isDuplicate = false;
                            for (Student s : foundCourse.getEnrolledStudents()) {
                                if (s.getStudentID().equals(sID)) {
                                    isDuplicate = true;
                                    break;
                                }
                            }

                            if (isDuplicate) {
                                System.out.println("This student is already registered for this course.\n");
                            } else {
                                
                                foundCourse.getEnrolledStudents().add(new Student(sID, sName));
                                System.out.println("Registration successful.\n");
                            }
                        }
                    }
                    
            }
            if(choice == 2){
                System.out.println("All Courses:");
                for(Course c: courses){
                    c.courseInformation();
                    System.out.println("---------------------------");
                }
                System.out.println("");
            }
            if(choice == 3){
                a++;
            }
        }
        
        
        
        
    }
    
}
