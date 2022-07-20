package MyUmsSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("welcome to the main method : ");

        Course course = new Course();

        Student student = new Student();

//        EnrolledStudent enroll = new  EnrolledStudent();



//        List<Course> courses = new ArrayList<>();
//
//        for() {
//            Course course = new Course();
//            course.setCourseName(Scanner.readline);
//            courses.add(course)
//        }
//
        // courses list will contain all input courses


        int number,choice;
        boolean condition = true;

        while (condition){
        System.out.println("Press 1 define course  ");
        System.out.println("Press 2 to view all courses and their detail ");
            System.out.println("Press 3 register new student ");
            System.out.println("Press 4 to view all student and their detail  ");
            System.out.println("Press 5 to view enroll student  ");
            System.out.println("Press 6 to view all student in the course ");
        Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    course.defineCourse();
                    break;
                case 2 :
                    course.viewCourse();

                    break;
                case 3 :
                    student.registerStudent();
                    break;
                case 4 :

                    student.viewStudent();


                    break;
                case 5 :

                    System.out.println("Working");

                    break;
                case 6 :
                    System.out.println("Working");
                    break;

                default:
                    System.out.println("Please enter given value ");
            }

            System.out.println("press 7 to exit else press any number to countinue");
            number = sc.nextInt();
            if(number == 7){
                condition = false;
            }
        }
        System.out.println("exit program successfully");

    }
}
