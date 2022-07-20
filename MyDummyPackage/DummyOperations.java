//package MyDummyPackage;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//public class DummyOperations {
//    public static void totalPrice(){
//        int value = 0;
//        int number = 0;
//        int sum = 0;
//        String line1 = "";
//        String name = "Price";
//        File myFile = new File("Course.txt");
//        try {
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                String line = sc.next();
//                if(line.equals(name)){
//                    line1 = sc.next();
//                    number = Integer.parseInt(line1);
//                    sum = sum + number;
//                    DummyOperations price = new DummyOperations();
//                    price.setValue(sum);
//                }
//            }
//
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
////        return totalPrice();
//    }
//
//    public static  void realTotalPrice(){
////          int sum;
////          sum = value;
//
//        System.out.println("Total price is : " + price.getValue);
//
//    }
