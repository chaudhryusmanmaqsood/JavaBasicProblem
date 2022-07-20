package MyDummyPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DummyMain {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        String line1 = "";
        String name = "Price";
        File myFile = new File("Course.txt");
        PriceCalculate price = new PriceCalculate();
        try {

            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.next();
                if(line.equals(name)){
                    line1 = sc.next();
                    number = Integer.parseInt(line1);
                    sum = sum + number;
                    System.out.println(sum);

//                    DummyOperations price = new DummyOperations();
//                    price.setValue(sum);
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        price.setSum(sum);
//        System.out.println(price.getSum());


//        Readline2.totalPrice();
//        System.out.println("Total price is : " + TotalPrice(price.getValue));
    }
}

                  /* number = Integer.parseInt(sc.next());
                    sum= sum + number;
                number = number + sc.nextInt();
               System.out.println(sc.next());*/
