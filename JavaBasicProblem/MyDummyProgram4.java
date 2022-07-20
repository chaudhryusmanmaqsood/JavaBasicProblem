

package JavaBasicProblem;

 public class MyDummyProgram4{

    static String sentences[] = new String[5];;

    public static void main(String[] args) {
        initializeArray();
        printArray();
    }

    public static void initializeArray() {
        for (int i = 0; i < 5; i++) {
            sentences[i] = "" + (i + 1);
        }
    }

    public static void printArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println(sentences[i]);
        }
    }
}