import java.util.Random;
import java.util.Scanner;
/**
 * Starter code for the "Guess My Number" exercise.
 */
class excercise_chapter_three_3_4 {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(100) + 1;

        // ask the user for input
        System.out.println("( ͡° ͜ʖ ͡°) Hi, im thinking of a number between 10 and 100");
        System.out.println("Can you guess what it is? >:)");
        System.out.println("Type a number ;3 :");

        // user inputs number
        int guess = input.nextInt();
        System.out.println("OwO your guess is: " + guess);
        System.out.println("uhmmmmm... Actually I was thinking of " + number);
        int Distance = 0;
        if  (guess < number) {
            Distance = number - guess;
        }
        if  (guess > number) {
            Distance = guess - number;
        }
        System.out.println("Wowieee...You were off by: " + Distance);
    }
    }

