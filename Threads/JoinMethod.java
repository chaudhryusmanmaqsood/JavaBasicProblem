package Threads;

public class JoinMethod {

    public static void main(String[] args) {
       JoinMethod1 join = new JoinMethod1();
       join.start();

        try {
            join.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=1; i<=5; i++){
            try {

            Thread.sleep(1000);
            System.out.println("This is the main method "+i);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

    }
}
