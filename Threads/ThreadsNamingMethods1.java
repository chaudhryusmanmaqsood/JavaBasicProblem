package Threads;

public class ThreadsNamingMethods1 extends Thread {

    public  void run(){
        System.out.println("I am executed by " + Thread.currentThread().getName());

    }
}
