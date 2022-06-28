package javabasicproblem;
import java.util.Scanner;

public class ModifyFindPercentage {

     public static void  percentageNumber(){
        Scanner sc = new Scanner(System.in);
        //array declaration
        int [] array = new int[5];
        int sum = 0;
        float percentage ;
        for(int i = 1; i < array.length; i++ ){
            System.out.println("Please enter the mark");
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }
           percentage = (sum * 100)/600;
         System.out.println("Your require percentage will be : " + percentage  + "%");

    }



    public  static void main (String[]args){

        percentageNumber();



    }



}
