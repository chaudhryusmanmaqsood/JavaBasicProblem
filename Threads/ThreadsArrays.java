package Threads;

class ArrayCase extends Thread {

    // perform single task from multiple thread
    public void run() {

        for (int i = 1; i <= 6; i++) {
            try {

                Thread.sleep(1000);
                System.out.println(i);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadsArrays {
    public static void main(String[] args) {
        //            Test th1 = new Test();
//            Test th2 = new Test();
//            th1.start();
//            th2.start();

        // perform single task from multiple thread
        //below is the thread
        //     |
        Test Threads[] = new Test[10];
        for (int j = 0; j < 10; j++) {
            Threads[j] = new Test();
            Threads[j].start();
            try {
                Threads[j].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
