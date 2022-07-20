package JavaBasicProblem;

import java.util.Scanner;

public class FlagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        int number1 = sc.nextInt();
        int number2 = number1 * 2;

        for (int row = 1; row <= number2; row++) {
            for (int colum= 1; colum <= number1 * 3; colum++) {
                if (colum <= number1 && row <= number1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }

            System.out.println();
        }


    }

}



