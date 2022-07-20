package Threads;

public class JoinMethod1 extends Thread {


    static Thread mainthread;
    public void run(){

        for (int i=1; i<=5; i++){
            try {
                mainthread.join();
                Thread.sleep(1000);
                System.out.println( "This is the run method " +i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
