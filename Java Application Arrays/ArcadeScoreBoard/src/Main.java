import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        String playerName = " ";
        String more = " ";
        int game = 0;
        int sum = 0;
        int highest = 0;
        int[] scores = new int[5];
        // Greetings
        System.out.println("Welcome to the Campus Arcade!");
        // Choosing a game
        System.out.println("Choose your game:");
        System.out.println("1 - Pixel Dash");
        System.out.println("2 - Robo Runner");
        System.out.println("3 - Galaxy Pong ");
        System.out.print("Enter game (1-3):");
        game = input.nextInt();
        // Asking for name
        System.out.print("Enter your name:");
        playerName = input.next();

        switch (game) {
            case 1:
                System.out.println("You selected Pixel Dash, " + playerName + "!");
                break;
            case 2:
                System.out.println("You selectedRobo Runner, " + playerName + "!");
                break;
            case 3:
                System.out.println("You selected Galaxy Pong, " + playerName + "!");
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("Enter 5 round scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Round " + (i + 1) + ": ");
            scores[i] = input.nextInt();
            sum += scores[i];
        }


        double average = (double) sum / scores.length;


        highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }


        System.out.println("Total Score: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);

        System.out.println("All Scores: \n" + Arrays.toString(scores));

        input.close();
    }
}