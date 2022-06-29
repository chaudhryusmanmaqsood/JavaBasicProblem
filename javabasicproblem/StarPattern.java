package javabasicproblem;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = sc.nextInt();

        int dummy = 1;
        for(int row = 1; row <= number; row++ ){

            //space loop
            for(int colum1 = number - 1; colum1 >= row; colum1--){
                System.out.print(" ");
            }

            // Stairic loop
            for(int colum2 = 1; colum2 <= dummy; colum2++){
                System.out.print("*");
            }

            System.out.println(" ");
            dummy = dummy + 2;
        }

    }
}
