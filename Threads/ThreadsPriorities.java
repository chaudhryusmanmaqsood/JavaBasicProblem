package Threads;

public class ThreadsPriorities {

    public static void main(String[] args) {

        // Ready Queue: T1 T2 T3 T4 T5
        MyThreadsPriorities t1 = new MyThreadsPriorities("Usman1");
        MyThreadsPriorities t2 = new MyThreadsPriorities("Usman2");
        MyThreadsPriorities t3 = new MyThreadsPriorities("Usman3");
        MyThreadsPriorities t4 = new MyThreadsPriorities("Usman4");
        MyThreadsPriorities t5 = new MyThreadsPriorities("Usman5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }


}
