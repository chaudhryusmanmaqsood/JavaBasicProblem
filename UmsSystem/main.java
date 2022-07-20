package UmsSystem;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Welcome to university of south asia");


        Course define_course = new Course();
        Course view_course = new Course();

        Student view_register = new Student();
        Student register_student = new Student();

        int number, choice;
        boolean condition = true;
        while (condition) {
            System.out.println("Press 1 define course  ");
            System.out.println("Press 2 register new student ");
            System.out.println("Press 3 to view all courses ");
            System.out.println("Press 4 to view all student  ");
            System.out.println("Press 5 to enroll student  ");
            System.out.println("Press 6 to view all student in the course ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    define_course.defineCourse();
                    break;
                case 2:

                    register_student.registerStudent();
                    break;
                case 3:
                    view_course.viewDefineCourse();
                    break;
                case 4:

                    view_register.viewStudent();

                    break;
                case 5:

                    System.out.println("Hey I am here ");

                    break;
                case 6:
                    System.out.println("Progress in underway");
                    break;

                default:
                    System.out.println("Please enter given value ");
            }

            System.out.println("press 7 to exit and press any number to countinue");
            number = sc.nextInt();
            if (number == 7) {
                condition = false;
            }
        }
        System.out.println("exit program successfully");

    }
}