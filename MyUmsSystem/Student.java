package MyUmsSystem;
import java.util.*;
import java.util.Scanner;
import java.lang.Object;
import java.util.Date;
public class Student {

    private static LinkedList<Integer> list4 = new LinkedList<>();

    private static LinkedList<String> list5 = new LinkedList<>();
//    private static List<Date> date = new ArrayList<Date>();
    private static LinkedList<Integer> list6 = new LinkedList<>();
    private static LinkedList<Integer> list7 = new LinkedList<>();



    public static void registerStudent() {

        System.out.println("Please enter student roll number : ");
        Scanner sc = new Scanner(System.in);
        list4.add(sc.nextInt());

        System.out.println("Please enter student name : ");
        list5.add(sc.next());

//             System.out.println("Please enter student date of birth : ");
////        date.add(new Date());
//        list6.add(sc.nextInt());

             System.out.println("Please enter student age : ");
        list7.add(sc.nextInt());


//        viewDefineCourse(l2); // Destination function
    }
    // below parameter type of receiver function
//   public static void viewCourse(LinkedList<String> l1 ){
    public static void viewStudent(){

        for(int i = 0;i < list4.size(); i++){

            System.out.println("The roll no of the student is : " + list4.get(i));
        }
        for(int i = 0;i < list5.size(); i++){

            System.out.println("The name of the student is : " + list5.get(i));
        }
//        for(int i = 0;i <  list6.size(); i++){
//
//            System.out.println("Date of birth of  Student is : " +  list6.get(i));
//        }
        for(int i = 0;i < list7.size(); i++){

            System.out.println("The roll no of the  student is  : " + list7.get(i));
        }

    }

    public static int rollNumber()
    {
        for(int i = 0;i < list4.size(); i++){

            System.out.println("The roll no of the students are : " + list4.get(i));
        }

        return rollNumber();

    }


}
