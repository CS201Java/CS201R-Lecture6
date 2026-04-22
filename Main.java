import java.util.Scanner;
 
public class Main {

    public static void main (String[] args){

        //write this 3 times>>
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("\n\nSum from 1 to 10 is " + sum);
        sum = 0;
        for (int i = 20; i <= 37; i++)
            sum += i;
        System.out.println("Sum from 20 to 37 is " + sum);
        sum = 0;
        for (int i = 35; i <= 49; i++)
            sum += i;
        System.out.println("Sum from 35 to 49 is " + sum);

        //write this one time and send the values
        sumValues(1,10);
        sumValues(20,37);
        sumValues(35,49);
 
        //using max function 
        //will determine which max function to use
        System.out.println("\n\nThe maximum of 30 and 54 is: " + (max(30,54)));
        System.out.println("The maximum of 3.0 and 5.4 is: " + (max(3.0,5.4)));
        System.out.println("The maximum of 30 and 5.4 is: " + (max(30,5.4)));
        System.out.println("The maximum of 30, 92 and 54 is: " + (max(max(30,92),54)));

        //pass by value
        int a = 10, b = 5;
        System.out.println("\n\na = " + a + " and b = " + b);
        swap (a,b);
	    System.out.println("a = " + a + " and b = " + b);

        //pass by value using wrapper class(reference)
        IntWrapper c = new IntWrapper(10);
        IntWrapper d = new IntWrapper(5);
        System.out.println("\n\nc = " + c.value + " and d = " + d.value);
        swap (c,d);
        System.out.println("c = " + c.value + " and d = " + d.value);

        //pass by value (array reference)
        int[] arr1 = {1,2,3,4,5};
        printArray(arr1);
        swap (arr1);
        printArray(arr1);
        System.out.println();

        swap (arr1);  //reset array
      	printArray(arr1);
        newArray (arr1);
  	    printArray(arr1);

        //pass by value an object(a note on Strings)
        String str1 = "Bubba Wubba";
        System.out.println(str1);
        changeString(str1);
        System.out.println(str1);
   
    }

    public static void sumValues(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;

        System.out.println("\n\nThe sum of " + i1 + " and " + i2 + " is " + result);
    }


    /** Find the max of two integer values */
    public static int max(int num1, int num2) {
        System.out.println("max(int num1, int num2)");
        if (num1 > num2)
        return num1;
        else
        return num2;
    }
     
    /** Find the max of two double values */
    public static double max(double num1, double num2) {
        System.out.println("max(double num1, double num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** Find the max of two integer values */
    public static double max(int num1, double num2) {
        System.out.println("max(int num1, double num2)");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    /** swap 2 integers */
    public static void swap(int x, int y) {
  	    System.out.println("Using primitive");
	    int temp = x;
	    x = y;
	    y = temp; 
    }

    static class IntWrapper{
        int value;                              // attribute
        IntWrapper(int v) {this.value = v;}     //constructor
    }  

    /** swap 2 integers in wrapper class*/
    public static void swap(IntWrapper x, IntWrapper y) {
	    System.out.println("Using intWrapper");
	    int temp = x.value;
        x.value = y.value;
	    y.value = temp; 
    }

    /** swap 2 values in array */
    public static void swap(int[] arr) {
   	    System.out.println("Using array class");
	    int temp = arr[0];
	    arr[0] = arr[arr.length - 1];
	    arr[arr.length - 1] = temp; 
    }
    
    /** create a new array */
    public static void newArray(int[] arr){
   	    System.out.println("Using newArray");
	    int tempArray[] = {11,12,13,14,15};
	    arr = tempArray; 
        printArray(arr);
    }

    /** print the array */
    public static void printArray(int[] arr) {
	    for (int i = 0; i < arr.length ; i++)
    	    System.out.print(arr[i] + " ");
        System.out.println();    
     
    }

    //** change string */
    public static void changeString(String str) {
	    str += " is the best!";   //this is creating a new string - strings are immutable
        System.out.println(str);    
     
    }
 
}
