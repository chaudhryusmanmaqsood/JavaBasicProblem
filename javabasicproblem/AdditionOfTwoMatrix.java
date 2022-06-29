package javabasicproblem;
import java.util.Scanner;

public class AdditionOfTwoMatrix {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int array1[][]  = new int[2][2];
        int array2[][]  = new int[2][2];
        int array3[][]  = new int[2][2];

        System.out.println("Enter first matrix data : ");
        for(int i = 0; i<2; i++){ // represent row

            for(int j = 0; j<2; j++){ // represent colum
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 2nd  matrix data : ");
        for(int i = 0; i<2; i++){ // represent row

            for(int j = 0; j<2; j++){ // represent colum
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("1st matrix result \n");
        for(int i = 0; i<2; i++){ // represent row

            for(int j = 0; j<2; j++){ // represent colum
                System.out.println(array1[i][j] + "");
            }
        }

        System.out.println("2nd matrix result \n");
        for(int i = 0; i<2; i++){ // represent row

            for(int j = 0; j<2; j++){ // represent colum
                System.out.println(array2[i][j] + "");
            }
        }

        System.out.println("The sum of two matrix is \n");
        for(int i = 0; i<2; i++){ // represent row

            for(int j = 0; j<2; j++){ // represent colum
                array3[i][j] =   array1[i][j] + array2[i][j];
                System.out.println(array3[i][j] + "");
            }
            System.out.print("\n");
        }

    }
}
