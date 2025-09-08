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


        //ARRAY METHODS
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = arr1.clone();
        int[] arr3 = {1,2,3,4,5,6,7};
        int[] arr4 = {7,6,5,4,3,2,1};
        System.out.println("arr1.hashCode() = " + arr1.hashCode());
        System.out.println("arr2.hashCode() = " + arr2.hashCode());
        System.out.println("arr3.hashCode() = " + arr3.hashCode());
        System.out.println("arr1.toString() = " + arr1.toString());
        System.out.println("arr1.equals(arr2) = " + arr1.equals(arr2));
        System.out.println("arr1.getClass()   = " + arr1.getClass());

        System.out.println("Arrays.toString(arr1)       = " + Arrays.toString(arr1));

        System.out.println("Arrays.equals(arr1, arr2))  = " + Arrays.equals(arr1, arr2) + "\tvs arr1 == aar2: " + (arr1 == arr2));
        System.out.println("Arrays.equals(arr1, arr3))  = " + Arrays.equals(arr1, arr3) + "\tvs arr1 == aar3: " + (arr1 == arr3));
        System.out.println("Arrays.equals(arr3, arr4))  = " + Arrays.equals(arr3, arr4) + "\tvs arr3 == aar4: " + (arr3 == arr4));
        Arrays.sort(arr4);
        System.out.println("Arrays.sort(arr4)  = " + Arrays.toString(arr4));
        System.out.println("Arrays.equals(arr3, arr4))   =  " + Arrays.equals(arr3, arr4) + "\tvs arr3 == aar4: " + (arr3 == arr4));       //Once sorted, you can use binarySearch on the array
        System.out.println("Arrays.binarySearch(arr4, 5) =  " + Arrays.binarySearch(arr4, 5));        
        System.out.println("Arrays.binarySearch(arr4, 8) =  " + Arrays.binarySearch(arr4, 8)); 

        Integer[][] arr5 = {{1, 2}, {3, 4}};
        Integer[][] arr6 = {{1, 2}, {3, 4}};
        Integer[][] arr7 = {{1, 2}, {5, 6}};

        System.out.println("arr5 deepEquals arr6:  = " + Arrays.deepEquals(arr5, arr6)); // true
        System.out.println("arr5 deepEquals arr7:  =  " + Arrays.deepEquals(arr5, arr7)); // false

        int[] arr8 = new int[10];
        Arrays.fill(arr8, 99);
        System.out.println("arr8 after Arrays.fill) = " + Arrays.toString(arr8));

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
        