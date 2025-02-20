package fourth_task;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void NumberGuessingInput() {
        Scanner scanner = new Scanner(System.in);
        boolean process = true;
        int attempts = 0;
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        while (process) {
            System.out.print("Please guess number: ");
            int guessNum = scanner.nextInt();
            attempts++;
            if (guessNum > randomNumber) {
                System.out.println("Please enter a lower number.");
            } else if (guessNum < randomNumber) {
                System.out.println("Please enter a higher number.");
            } else {
                System.out.println("Congratulations, you found the random number!");
                System.out.println("It took you " + attempts + " attempts.");
                process = false;
            }
        }
    }
}
