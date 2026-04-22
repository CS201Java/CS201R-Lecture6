import java.util.Random;
import java.util.Scanner;

public class Games {

    //PRE: accepts Scanner object
    //POST: generate 0,1,2 for computer
    //      get a value 0,1,2 from user
    //      determine who wins or tie
    public static void playRPS(Scanner scan){
        Random rand = new Random();

        boolean keepPlaying = true;
        while (keepPlaying){
            
            String userGuessString;
            System.out.println("Enter your choice: 0(Rock), 1(Paper), 2(Scissors): ");
            userGuessString = scan.nextLine();
            int userGuess = verifyGuess(userGuessString);
            //complete logic for RPS
 


            
 
        }

    }
    public static int verifyGuess(String str){
        if (str.charAt(0) == '0') return 0;
        if (str.charAt(0) == '1') return 1;
        if (str.charAt(0) == '2') return 2;     
        return -1;
    }
    
}
