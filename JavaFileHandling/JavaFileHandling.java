package JavaFileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandling {

        public static void main(String[] args) {

            boolean flag = true;
        while (flag) {
            JavaFileHandlingPart2.printOptions();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    JavaFileHandlingPart2.inputCourseDetails();
                    break;
                case 2:
                    JavaFileHandlingPart2.inputRegisterStudent();

                    break;
                case 3:
                    JavaFileHandlingPart2.viewCourse();
                    break;
                case 4:
                    JavaFileHandlingPart2.viewAllStudent();
                    break;
                case 5:
                    JavaFileHandlingPart2.inputEnrolledStudent();
                    break;
                case 6:
//                    UMS.viewSameCousreStudent();
                    break;
                case 0:
                    flag = false;
                    System.out.println("Thank you for using UMS.");
                default:
                    System.out.println("Please provide valid input");
            }
        }



        }
    }


