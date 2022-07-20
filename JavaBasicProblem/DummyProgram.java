package JavaBasicProblem;

import java.util.Scanner;

public class DummyProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to define course");
        String[]course = new String[100];
        String[]teacher = new String[100];
        String[]subject = new String[100];
        sc.nextLine();


        for(int i = 0; i < course.length && i < teacher.length && i <subject.length; i++) {
            System.out.print("Please enter the name of course : ");
            course[i] = sc.next();

            System.out.print("Please enter the name teacher : ");
            teacher[i] = sc.next();

            System.out.print("Please enter the name of subject : ");
            subject[i] = sc.next();
        }

    }
}
