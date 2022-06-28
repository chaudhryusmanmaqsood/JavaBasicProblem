package javabasicproblem;
import java.util.Scanner;

public class ModifyGreaterNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // array declaration
        int[] array = new int[100];
        System.out.print("Please enter the total number of elements from 1 to 100 : ");
        int number = sc.nextInt();

        int maximum = array[0];

        // for(int i=1; i<array.length; i++){
           for(int i = 1; i <= number; i++){

            System.out.print("Enter the number elements :  ");
            array[i] = sc.nextInt();
            if( array[i] > maximum){
                maximum = array[i];
            }
        }
        System.out.print("The maximum number is : " + maximum);

    }
}
