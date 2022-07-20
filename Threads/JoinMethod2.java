package Threads;

public class JoinMethod2 extends Thread {

   static Thread mainthread;

    public void run(){

        try{
             mainthread.join();
            for (int i=1; i<=5; i++){
                Thread.sleep(1000);
                System.out.println("This is the run method "+i);
        }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }



    public static void main(String[] args) {

       mainthread = Thread.currentThread();
       JoinMethod2 thread2 = new JoinMethod2();
        thread2.start();

        try{

            for (int i=1; i<=5; i++){
                Thread.sleep(1000);
                System.out.println("This is the main method "+i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

