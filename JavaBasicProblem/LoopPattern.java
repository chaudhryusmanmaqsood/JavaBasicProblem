package JavaBasicProblem;

public class LoopPattern {
    public static void main(String[]args){
        // 1st loop represent the row
//        for(int i=1; i<=4; i++){
//
////            2nd loop represent the column
//           for(int j=1; j<=i; j++){
//               System.out.print("*");
//           }
//            System.out.println();
//        }

//        for(int i=1; i<=4; i++){
//
//           for(int j=4; j>=i; j--){
//               System.out.print("*");
//           }
//            System.out.println();
//        }

        // 2nd pattern of loop

        for(int i=1; i<=4; i++){

           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
            System.out.println();
        }
        for(int i=1; i<=4; i++){

            for(int j=3; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
