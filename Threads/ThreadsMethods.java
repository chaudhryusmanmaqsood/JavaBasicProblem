package Threads;

public class ThreadsMethods {
    public static void main(String[] args) {
        MyThreadMethods1 t1 = new MyThreadMethods1();
        MyThreadMethods2  t2 = new MyThreadMethods2 ();
        t1.start();
        try{
            t1.join(); // t1 jab tak khatam nehi hojata tab tak t1 chale ga
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }


}
