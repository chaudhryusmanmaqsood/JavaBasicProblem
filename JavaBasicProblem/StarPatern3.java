package JavaBasicProblem;
import java.util.Scanner;
public class StarPatern3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = sc.nextInt();
        int dummy = 1;
        int result = number / 2 + 1;

        for(int row = 1; row <= result; row++){

            // below code for spacing
            for(int space = result - 1; space >= row; space--){
                System.out.print(" ");
            }
            for(int stairic = 1; stairic <= dummy; stairic++ ){

                System.out.print("*");
            }
            dummy = dummy + 2;
            System.out.println();

        }




    }
}