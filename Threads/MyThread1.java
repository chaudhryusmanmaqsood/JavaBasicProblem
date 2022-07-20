package Threads;

public class MyThread1 extends Thread {
    @Override
    public  void run(){
            int i =0;
            while(i<40000){
                System.out.println("My Cooking Thread is Running");
                System.out.println("I am happy!");
                i++;
            }
        }
//    @Override
//    public static  void run(){
//        int i =0;
//        while(i<40000){
//            System.out.println("My Cooking Thread is Running");
//            System.out.println("I am happy!");
//            i++;
//        }
//    }
    }


