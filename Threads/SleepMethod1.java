package Threads;

public class SleepMethod1 extends Thread {

    public void run(){
                for (int i=1; i<=5; i++){
            try {

            Thread.sleep(2000);
            System.out.println(i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
