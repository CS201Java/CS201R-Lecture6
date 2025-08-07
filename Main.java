import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        //ARRAY EXAMPLE
        int[] myList4 = new int[10];
        for (int i = 0; i < 10; i++)
            myList4[i] = i + 1;
        
        for (int i = 0; i < 10; i++)
            System.out.print(myList4[i] + " ");

        System.out.println();

        //ARRAYS - YOUR TURN #1
        //Write the pseudocode to initialize the 10 values in an array 
        //to random values between 5 and 15



        //ARRAYS - YOUR TURN #2
        //Initialize an array to 20 random integer values between 10 and 20 (see #1)
        //Find the average of the even values over 15 in the array



        //ARRAYS - YOUR TURN #3
        int[] deck = new int[52];
        
        //INITIALIZE DECK
         
        //SHUFFLE
         
        String[] suit = {"Hearts","Diamonds", "Spades", "Clubs"};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        //DEAL CARDS
         


        //ARRAYLISTS
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(50);
        myList.add(0,40);   
        myList.add(1,90);
        System.out.println(myList); 

        myList.remove(2);    
        System.out.println(myList.size() + " = " + myList); 
        myList.add(80);
        myList.add(20);
        System.out.println(myList.size() + " = " + myList); 

        //ARRAYLIST SORT IN ASCENDING ORDER USING COMPARATOR
        myList.sort(Comparator.naturalOrder());
        System.out.println(myList.size() + " = " + myList); 

        //ARRAYLIST SORT IN DESCENDING ORDER USING COMPARATOR
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList.size() + " = " + myList); 

        //ARRAYLIST SORT IN EVEN NUMBERS FIRST
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(5,2,9,1,3,10,6,11));
        myList2.sort((a, b) -> {
                // Even numbers come first
                if (a % 2 == 0 && b % 2 != 0) return -1;
                if (a % 2 != 0 && b % 2 == 0) return 1;
                return a - b;  // Normal comparison if both even or both odd
            });
        System.out.println(myList2.size() + " = " + myList2); 



        //YOUR TURN #4
        //CREATE AN ARRAYLIST 

    }
}
        