package javabasicproblem;
import java.util.Scanner;
public class StarPattern2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number : ");
        int number = sc.nextInt();

        int result = number /2 +1;
        int dummy = 1;

        for(int row = 1; row <= result; row++){

            //below loop use for spacing
            for(int space = result - 1; space >= row; space-- ){
                System.out.print(" ");
            }
            //below loop use for stairic
            for(int stairic = 1; stairic <= dummy; stairic++){
                System.out.print("*");
            }
            dummy = dummy + 2;
            System.out.println();


        }




    }
}
