package UmsSystem;
import java.util.Scanner;
public class Student {

//    static int[] real_roll_no = new int[100];
    static int[] roll_number = new int[100];
    static String[] name = new String[100];
    static int[] date_of_birth = new int[1000];
    static int[] age = new int[1000];

    public static void registerStudent() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.print("Please enter student roll number : ");
            roll_number[i] = sc.nextInt();

            System.out.print("Please enter student name : ");
            name[i] = sc.next();

            System.out.print("Please enter student date of birth : ");
            date_of_birth[i] = sc.nextInt();

            System.out.print("Please enter student age : ");
            age[i] = sc.nextInt();

        }
    }


        public static void viewStudent(){
            for (int i = 0; i < 2; i++) {

                System.out.println("The name of all student are : " + name[i]);
//            System.out.println("Student roll number  : " +  roll_number[i] );
//            System.out.println("Date of birth of student : " +  date_of_birth[i] );
//            System.out.println("The age of student is : " +  age[i] );

            }
        }
}


//    int age;

//    Student(int age) {
//
//        this.age = age;
//
//    }