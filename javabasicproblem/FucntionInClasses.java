package javabasicproblem;
import java.util.Scanner;

class Triangle{

    int number,result ;
    int dummy = 1;

    public void  giveTriangle(){
        System.out.println(" \"Welcome to the triangle world\" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any odd number : ");
         number = sc.nextInt();
        result = number /2 + 1;


          for(int row = 1; row <= result; row++) {

            //below loop use for spacing
            for (int space = result - 1; space >= row; space--) {
                System.out.print(" ");
            }
            //below loop use for stairic    
            for (int stairic = 1; stairic <= dummy; stairic++) {
                System.out.print("*");
            }
            dummy = dummy + 2;
            System.out.println();

        }

    }
}

class Flag{

     int number1,number2 ;

    public void giveFlag() {
        System.out.println(" \"Welcome to Flag world\" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number : ");
        int number1 = sc.nextInt();
        number2 = number1 * 2;

     for (int row = 1; row <= number2; row++) {
         for (int colum = 1; colum <= number1 * 3; colum++) {
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

public class FucntionInClasses {
    public static void main(String[] args) {
        System.out.println(" \"welcome to main page\" ");
        Triangle user1 = new Triangle(); // made an object of triangle class constructor made an object
        Flag user2 = new Flag(); // made an object of flag class and also constructor made an object

//       user2.giveFlag();
//       user1.giveTriangle();

        System.out.print("If you want to see triangle press 1 else press 2 to see Flag : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                user1.giveTriangle();
                break;
            case 2:
                user2.giveFlag();
                break;
            default:
                System.out.println("Please enter suitable number");

         // 2nd aapproach
//       if(choice == 1){
//           user2.giveFlag();
//       }else{
//
//       }


        }
    }
}
