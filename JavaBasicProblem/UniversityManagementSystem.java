//package javabasicproblem;
//import com.sun.security.jgss.GSSUtil;
//import org.w3c.dom.ls.LSOutput;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//class Enroll{
//
//    /*
//    1. roll no should be enrolled
//    2. course name should be enrolled
//     */
//
//    static int[] enrolled_roll_no = new int[100];
//    static String[] enrolled_course_name = new String[100];
//
//    Enroll enrolledRollNo = new Student;
//
//}
//
//
//class Student {
////
//
//    //    static int[] real_roll_no = new int[100];
//    static int[] roll_number = new int[100];
//    static String[] name = new String[100];
//    static int[] date_of_birth = new int[1000];
//    static int[] age = new int[1000];
//
//    public static void registerStudent() {
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 1; i++) {
//
//            System.out.print("Please enter student roll number : ");
//            roll_number[i] = sc.nextInt();
//
//            System.out.print("Please enter student name : ");
//            name[i] = sc.next();
//
//            System.out.print("Please enter student date of birth : ");
//            date_of_birth[i] = sc.nextInt();
//
//            System.out.print("Please enter student age : ");
//            age[i] = sc.nextInt();
//
//        }
//    }
//
//
//        public static void viewStudent() {
//            for (int i = 0; i < 1; i++) {
//
//                System.out.println("The name of all student are : " + name[i]);
////            System.out.println("Student roll number  : " +  roll_number[i] );
////            System.out.println("Date of birth of student : " +  date_of_birth[i] );
////            System.out.println("The age of student is : " +  age[i] );
//
//            }
//        }
//
//    }
//
//
//class Course {
//
//    /*
//    1.Store the name of course
//    2. Store the name of teacher
//    3. Store the name of subject
//     */
//    // initialize the variable and making three string arrays
//
//    static String[] course = new String[10];
//    static String[] teacher = new String[10];
//    static String[] subject = new String[10];
//
//    int i;
//    int j;
//    public static void defineCourse(){
//
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0,j = 1; i < j; i++,j++){
//            System.out.print("Please enter course name : ");
//            course[i] = sc.nextLine();
//            if(course[i]){
//
//            }
//
//            System.out.print("Please enter the teacher name : ");
//            teacher[i] = sc.nextLine();
//
//            System.out.print("Please enter the subject name : ");
//            subject[i] = sc.nextLine();
//        }
//    }
//
//    public static void viewDefineCourse(){
//
//        for(int i = 0; i < 1; i++){
//
//            System.out.println("The name of the courses are : " +  course[i] );
////            System.out.println("The name of the teachers are : " +  teacher[i] );
////            System.out.println("The name of the subjects are : " +  subject[i] );
//
//        }
//    }
//
//}
//
//public class UniversityManagementSystem {
//    public static void main(String[] args) {
//        System.out.println("Welcome to university of south asia");
//
//
//        Course define_course = new Course();
//        Course view_course = new Course();
//
//        Student view_register = new Student();
//        Student register_student = new Student();
//
//        int number,choice;
//        boolean condition = true;
//        while (condition){
//        System.out.println("Press 1 define course  ");
//        System.out.println("Press 2 to view all courses ");
//            System.out.println("Press 3 register new student ");
//            System.out.println("Press 4 to view all student  ");
//            System.out.println("Press 5 to enroll student  ");
//            System.out.println("Press 6 to view all student in the course ");
//        Scanner sc = new Scanner(System.in);
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//
//                    define_course.defineCourse();
//                    break;
//                case 2 :
//                    view_course.viewDefineCourse();
//
//                    break;
//                case 3 :
//                    register_student.registerStudent();
//                    break;
//                case 4 :
//                    view_register.viewStudent();
//
//
//                    break;
//                case 5 :
//
//                    System.out.println("Hey I am here ");
//
//                    break;
//                case 6 :
//                    System.out.println("Progress in underway");
//                    break;
//
//                default:
//                    System.out.println("Please enter given value ");
//            }
//
//            System.out.println("press 7 to exit and press any number to countinue");
//            number = sc.nextInt();
//            if(number == 7){
//                condition = false;
//            }
//        }
//        System.out.println("exit program successfully");
//
//    }
//}
//
//
////    int age;
////
////    Student(int age) {
////
////        this.age = age;
////
////    }
//
////    public static void storeCourse(){
////        for(int i = 0; i < 2; i++){
////            real_roll_no[i] = roll_number[i];
////    }
