package JavaBasicProblem;
import java.util.Scanner;
public class MyDummyProgram3 {
    public static void main(String[] args) {


        String[] course = new String[10];
        String[] teacher = new String[10];
        String[] subject = new String[10];
        Scanner sc = new Scanner(System.in);
        int i = 0;


        for(i = 0; i < 5; i++){

            System.out.print("Enter course : ");
            course[i] = sc.nextLine();

            System.out.print("Enter course : ");
            teacher[i] = sc.nextLine();

            System.out.print("Enter course : ");
            subject[i] = sc.nextLine();
        }

        for(i = 0; i < 5; i++){

            System.out.println("The name of the courses are : " +  course[i] );
            System.out.println("The name of the teachers are : " +  teacher[i] );
            System.out.println("The name of the subjects are : " +  subject[i] );

        }

//       while(i < j )
//            System.out.print("Enter course : ");
//        course[i] = sc.nextLine();
//         i = i + 1;
//         j = j + 1;
//         if(i < j){
//             break;
//     }
//
//        System.out.print("Enter teacher : ");
//        teacher = sc.nextLine();
//
//        System.out.print("Enter subject : ");
//        subject = sc.nextLine();
//
//        System.out.println(course);
//        System.out.println(teacher);
//        System.out.println(subject);
//
//        // declare an array



    }
}
