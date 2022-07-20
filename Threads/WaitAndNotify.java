package Threads;

class TotalEarnings extends Thread{

    int total = 0;
    public void run(){
       synchronized (this){
        for(int i = 1; i <= 10; i++){
            total = total + 100;
        }
            this.notify(); // Lock release
       }
    }

}

public class WaitAndNotify {
    public static void main(String[] args) {
    TotalEarnings thread1 = new TotalEarnings();
    thread1.start();
    synchronized (thread1){
        try {
            thread1.wait(); // Lock acquire
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total Earnings is " + thread1.total + " Rs");

        }

    }
}
