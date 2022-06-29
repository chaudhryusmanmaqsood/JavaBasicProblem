package javabasicproblem;

import java.util.Scanner;

public class FlagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        int number1 = sc.nextInt();
        int number2 = number1 * 2;

        for (int r = 1; r <= number2; r++) {
            for (int c = 1; c <= number1 * 3; c++) {
                if (c <= number1 && r <= number1) {
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
//            if(r <= number1){
//                System.out.print("*");
//            }
//            else{
//                System.out.print("-");
//            }
            System.out.println();
        }


    }

}



