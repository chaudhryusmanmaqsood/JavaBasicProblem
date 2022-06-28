package javabasicproblem;
import java.util.Scanner;
public class CheckPrimeOrNot3 {
    public static void main(String[]args){
        int number, i, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any number : ");
        number = sc.nextInt();

        for(i = 2; i <= number; i++) {
            if (number % i == 0)
                count++;
             }
        if (count == 1)
            System.out.println("The number is prime");
        else
            System.out.println("The number is not prime ");
            }
        }
