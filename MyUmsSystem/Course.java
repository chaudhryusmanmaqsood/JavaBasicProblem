package MyUmsSystem;
import java.util.*;
import java.util.Scanner;

public class Course {

//    String courseName;
    private static LinkedList<String> l1 = new LinkedList<>();
    private static LinkedList<String> l2 = new LinkedList<>();
    private static LinkedList<String> l3 = new LinkedList<>();


    public static void defineCourse() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter course name : ");
        l1.add(sc.next());

        System.out.println("Please enter the teacher name : ");

        l2.add(sc.next());

        System.out.println("Please enter the subject name: ");

        l3.add(sc.next());
//        viewDefineCourse(l1); // Destination function
    }
                                 // below parameter type of receiver function
//   public static void viewCourse(LinkedList<String> l1 ){
    public static void viewCourse(){

        for(int i = 0;i < l1.size(); i++){

            System.out.println("The name of the course is : " + l1.get(i));
        }
        for(int i = 0;i < l2.size(); i++){

            System.out.println("The name of the student is : " + l2.get(i));
        }
        for(int i = 0;i < l3.size(); i++){

            System.out.println("The name of the subject is : " +l3.get(i));
        }
    }

//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
}
