import java.util.Scanner;
import java.util.Random;

public class Games {

    //PRE: accepts Scanner object
    //POST: generate 0,1,2 for computer
    //      get a value 0,1,2 from user
    //      determine who wins or tie
    public static void playRPS(Scanner scan){
        Random rand = new Random();

        boolean keepPlaying = true;
        while (keepPlaying){
            int compGuess = rand.nextInt(3);

            String userGuessString;
            System.out.println("Enter your choice: 0(Rock), 1(Paper), 2(Scissors): ");
            userGuessString = scan.nextLine();
            int userGuess = verifyGuess(userGuessString);
            while (userGuess == -1){
                System.out.println("Enter valid choice: ");
                userGuess = verifyGuess(userGuessString);
            }
            System.out.println("The computer guessed: " + compGuess);
            if (compGuess == userGuess) System.out.println("You tied!");
            else if (compGuess == 0 && userGuess == 1) System.out.println ("paper covers rock - you win!");
            else if (compGuess == 0 && userGuess == 2) System.out.println("rock crushes scissors - you lose!");
        
            System.out.println("Continue? y/n");
            String contString = scan.nextLine();
            if (contString.trim().toUpperCase().charAt(0) != 'Y')
                keepPlaying = false;
        }

    }
    public static int verifyGuess(String str){
        if (str.charAt(0) == '0') return 0;
        if (str.charAt(0) == '1') return 1;
        if (str.charAt(0) == '2') return 2;     
        return -1;
    }
    
}
