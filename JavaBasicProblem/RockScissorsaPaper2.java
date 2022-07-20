package JavaBasicProblem;
import java.util.Random;
import java.util.Scanner;
public class RockScissorsaPaper2 {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);
        int rock = 0;
        int scissors = 1;
        int paper = 2;


        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == rock && computerInput == paper || userInput == scissors && computerInput == rock
                || userInput == paper && computerInput == scissors) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if (computerInput == 0) {
            System.out.println("Computer choice: Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer choice: Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer choice: Scissors");
        }
    }
}
