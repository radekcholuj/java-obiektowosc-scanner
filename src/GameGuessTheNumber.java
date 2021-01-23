import java.util.Scanner;

public class GameGuessTheNumber {
    public static void main(String[] args) {
        int numberToGuess = 341;
        int guessedNumber;
        int numberOfTries = 0;
        long startTime = System.currentTimeMillis();
        do {
            Scanner scanner = new Scanner(System.in, "UTF-8");
            System.out.println("Enter a number: ");
            guessedNumber = scanner.nextInt();

            if (guessedNumber > numberToGuess){
                System.out.println("Number is too large.");
            } else if(guessedNumber < numberToGuess) {
                System.out.println("Number is too small.");
            }
            numberOfTries++;
        } while(guessedNumber != numberToGuess);
        long stopTime = System.currentTimeMillis();
        System.out.println("OK.");
        System.out.println("Number of tries: "+numberOfTries);
        System.out.println("Time: "+(stopTime - startTime));
    }
}
