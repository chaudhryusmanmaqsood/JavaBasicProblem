package Threads;

public class MyThreadMethods1 extends Thread {
    public void run(){
        int i = 0;
        while(i<66666){
//            System.out.println("I am a thread");
            System.out.println("Chaudhry : ");
//            try {
//                Thread.sleep(455);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            i++;
        }
    }
}
