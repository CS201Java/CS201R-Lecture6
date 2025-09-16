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
        int[] myList1 = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            int tempRand = rand.nextInt(11) + 5;
            myList1[i] = tempRand;
            System.out.print(myList1[i] + " ");
        }
        System.out.println();


        //ARRAYS - YOUR TURN #2
        //Initialize an array to 20 random integer values between 10 and 20 (see #1)
        //Find the average of the even values over 15 in the array
        int aveCounter = 0;
        double ave = 0;
        int[] myList10 = new int[20];
        for (int i = 0; i < 20; i++){
            int randValue = rand.nextInt(11) + 10;
            myList10[i] = randValue;
            if (myList10[i] >= 16 && myList10[i]%2  == 0){
                ave += myList10[i];
                aveCounter ++;
            }
        }
        if (aveCounter > 0){
            double aveTotal = ave/aveCounter;
            System.out.println(aveTotal);
        }
        else
            System.out.println("no even values over 15");




        //ARRAY METHODS
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = arr1.clone();
        int[] arr3 = {1,2,3,4,5,6,7};
        int[] arr4 = {7,6,5,4,3,2,1};
        System.out.println("arr1.hashCode() = " + arr1.hashCode());
        System.out.println("arr2.hashCode() = " + arr2.hashCode());
        System.out.println("arr3.hashCode() = " + arr3.hashCode());
        System.out.println("arr1.toString() = " + arr1.toString());
        System.out.println("arr1.getClass()   = " + arr1.getClass());

        System.out.println("\nArrays.toString(arr1)       = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr2)       = " + Arrays.toString(arr2));
        arr2[3] = 17;
        System.out.println("\nArrays.toString(arr1)       = " + Arrays.toString(arr1));
        System.out.println("Arrays.toString(arr2)       = " + Arrays.toString(arr2));        

        System.out.println("\nArrays.equals(arr1, arr2))  = " + Arrays.equals(arr1, arr2) + "\tvs arr1 == aar2: " + (arr1 == arr2) + "\tvs arr1.equals(arr2) = " + arr1.equals(arr2));
        System.out.println("Arrays.equals(arr1, arr3))  = " + Arrays.equals(arr1, arr3) + "\tvs arr1 == aar3: " + (arr1 == arr3) + "\tvs arr1.equals(arr3) = " + arr1.equals(arr3));
        System.out.println("Arrays.equals(arr3, arr4))  = " + Arrays.equals(arr3, arr4) + "\tvs arr3 == aar4: " + (arr3 == arr4) + "\tvs arr3.equals(arr4) = " + arr3.equals(arr4));
        Arrays.sort(arr4);
        System.out.println("\nArrays.sort(arr4)  = " + Arrays.toString(arr4));
        System.out.println("Arrays.equals(arr3, arr4))   =  " + Arrays.equals(arr3, arr4) + "\tvs arr3 == aar4: " + (arr3 == arr4) + "\tvs arr3.equals(arr4) = " + arr3.equals(arr4));       
        
        //Once sorted, you can use binarySearch on the array
        System.out.println("\nArrays.binarySearch(arr4, 5) =  " + Arrays.binarySearch(arr4, 5));        
        System.out.println("Arrays.binarySearch(arr4, 8) =  " + Arrays.binarySearch(arr4, 8)); 

        Integer[][] arr5 = {{1, 2}, {3, 4}};
        Integer[][] arr6 = {{1, 2}, {3, 4}};
        Integer[][] arr7 = {{1, 2}, {5, 6}};
        Integer[][] arr8 = arr7.clone();

        System.out.println("\narr5 deepEquals arr6:  = " + Arrays.deepEquals(arr5, arr6)); // true
        System.out.println("arr5 deepEquals arr7:  =  " + Arrays.deepEquals(arr5, arr7)); // false

        System.out.println("arr7 deepEquals arr8:  =  " + Arrays.deepEquals(arr7, arr8)); // false  
        arr8[0][1] = 30;
        System.out.println("Arrays.toString(arr7)) = " + Arrays.toString(arr7[0]) + Arrays.toString(arr7[1]));    
        System.out.println("Arrays.toString(arr8)) = " + Arrays.toString(arr8[0]) + Arrays.toString(arr8[1])); 
        System.out.println("\narr7 & arr8 hashCode() = " + arr7.hashCode() + " " + arr8.hashCode()); 
        System.out.println("arr7[0].hashCode() = " + arr7[0].hashCode()); 
        System.out.println("arr8[0].hashCode() = " + arr8[0].hashCode());    
        System.out.println("arr7 deepEquals arr8:  =  " + Arrays.deepEquals(arr7, arr8)); // false 

        int[] arr9 = new int[10];
        Arrays.fill(arr9, 99);
        System.out.println("arr9 after Arrays.fill) = " + Arrays.toString(arr9));

        int[] arr10 = new int[5];
        System.arraycopy(arr10,0,arr9,0,3);
        System.out.println("Arrays.toString(arr10)   = " + Arrays.toString(arr10));

        int[] arr11 = arr1;
        System.out.println("arr1.hashCode()  = " + arr1.hashCode());
        System.out.println("arr11.hashCode() = " + arr11.hashCode());
        
        //ARRAYS - YOUR TURN #3
        int[] deck = new int[52];
        //INITIALIZE DECK
        for (int i = 0; i < deck.length; i++ ){
            deck[i] = i;
        }
        //SHUFFLE
        for (int i = 0; i < deck.length; i++){
            int temp = deck[i];
            int tempPos = rand.nextInt(52);
            deck[i] = deck[tempPos];
            deck[tempPos] = temp;
        }
        String[] suit = {"Hearts","Diamonds", "Spades", "Clubs"};
        String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        //DEAL CARDS
        int tempCard = deck[0];
        int cardSuit = tempCard/13;
        int cardValue = tempCard%13;
        System.out.println(cards[cardValue] + " of " + suit[cardSuit]);


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

        ArrayList<Integer> myList3 = new ArrayList<>(List.of(1,4,5,6,7,8,9));

        //YOUR TURN #4
        //CREATE AN ARRAYLIST OF MYCLASS
        ArrayList<MyClass> myClassList = new ArrayList<>();
        MyClass object1 = new MyClass("Frank", "Instein", 140);
        MyClass object2 = new MyClass("Bugs", "Bunny", 14);
        MyClass object3 = new MyClass("Yosemite", "Sam", 44);
        myClassList.add(object1);
        myClassList.add(object2);
        myClassList.add(object3);
        System.out.println("myClassList.hashCode()  = " + myClassList.hashCode()); 
        for (MyClass temp : myClassList)
            System.out.println("temp.hashCode()  = " + temp.hashCode());

        //shallow copy
        ArrayList<MyClass> myClassList2 = myClassList; //shallow copy 

        System.out.println("\nmyClassList2.hashCode() = " + myClassList2.hashCode()); 
        for (MyClass temp2 : myClassList2)
            System.out.println("temp2.hashCode()  = " + temp2.hashCode());

        //deep copy
        ArrayList<MyClass> myClassList3 = new ArrayList<>();   
        for (MyClass temp : myClassList)
            myClassList3.add(new MyClass(temp));
            
        System.out.println("\nmyClassList3.hashCode() = " + myClassList3.hashCode()); 
        for (MyClass temp3 : myClassList3)
            System.out.println("temp3.hashCode()  = " + temp3.hashCode());        
    }
}
        