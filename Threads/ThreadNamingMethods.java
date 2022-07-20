package Threads;

public class ThreadNamingMethods {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().getName());

        // Now I change the name of thread
//        Thread.currentThread().setName("Super man");
        System.out.println("Hello I am executed by " + Thread.currentThread().getName());
//        System.out.println(10/0);
        ThreadsNamingMethods1 thr1 = new ThreadsNamingMethods1();
        thr1.setName("Usman"); // if you not set thread name then JVM set its name automatically
        thr1.start();

        ThreadsNamingMethods1 thr2 = new ThreadsNamingMethods1();
        thr2.setName("Chaudhry");
        thr2.start();

    }
}
