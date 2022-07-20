package UmsSystem;

import java.util.Scanner;

class Course {

    /*
    1.Store the name of course
    2. Store the name of teacher
    3. Store the name of subject
     */
    // initialize the variable and making three string arrays

    static String[] course = new String[10];
    static String[] teacher = new String[10];
    static String[] subject = new String[10];

    public static void defineCourse() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.print("Please enter course name : ");
            course[i] = sc.nextLine();

            System.out.print("Please enter the teacher name : ");
            teacher[i] = sc.nextLine();

            System.out.print("Please enter the subject name : ");
            subject[i] = sc.nextLine();
        }
    }

    public static void viewDefineCourse(){

        for(int i = 0; i < 2; i++){

            System.out.println("The name of the courses are : " +  course[i] );
//            System.out.println("The name of the teachers are : " +  teacher[i] );
//            System.out.println("The name of the subjects are : " +  subject[i] );

        }
    }
}
