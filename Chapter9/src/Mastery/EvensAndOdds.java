/*

Program: EvensAndOdds_Mastery.java          Date: December 9, 2024

Purpose: An EvensAndOdds application that generates 25 random integers between 0 and 99 and then displays all the evens on one line and all the odds on the 
next line.


School: CHHS
Course: Computer Science 20
 
*/

package Mastery; // Package name is Mastery

import java.util.ArrayList; // Import ArrayList so that the evens and odds ArrayLists are dynamic(can switch how many values they hold)

public class EvensAndOdds { // public class name EvensAndOdds
   public static void main(String[] args) { // Starting the public static void main method
	   
       // An integer array called randomNumebrs that can hold 25 integers (these will be randomly generated below)
       int[] randomNumbers = new int[25];
       
       // Beginning the for loop to populate randomNumbers with 25 randomly generated integers
       // This loop runs 25 times, once for each element (runs from index 0-24 Ex. i = 0, i = 1 ... i = 24) (1 gets added to "i" each time the loop runs)
       for (int i = 0; i < 25; i++) { 
    	// This code generates a random integer between 0 and 99 and adds it to the randomNumbers array
    	// math.random generates a double number between 0(inclusive) and 1(exclusive), this gets multiplied by 100 and turned into an integer (explained more in reflection log)
           randomNumbers[i] = (int) (Math.random() * 100); 
       } // close for loop
       
       // Create two ArrayLists to store even and odd numbers
       ArrayList<Integer> evens = new ArrayList<>(); // List to store even numbers
       ArrayList<Integer> odds = new ArrayList<>();  // List to store odd numbers
       
       // Separate the random numbers into the even and odd ArrayLists
       for (int i = 0; i < 25; i++) { // Loop through all 25 elements in the randomNumbers array (explained more in the reflection log)
           if (randomNumbers[i] % 2 == 0) { // Check if the number is divisible by 2 while leaving no remainder(this is even)
               evens.add(randomNumbers[i]); // If it is then add it to the evens list 
           } else { // If the number is not even, it must be odd (there is a remainder)
               odds.add(randomNumbers[i]); // If it isn't true add it to the odds list
           } // close else condition
       } // close for loop
       
       // Display all even numbers
       System.out.print("EVEN: "); // Indicate that these are even numbers
       for (int even : evens) { // Loop through each number in the evens list
           System.out.print(even + " "); // Print each even number followed by a space so that they are not combined together
       }
       // Display all odd numbers
       System.out.print("\nODD: "); // Indicate that these are odd numbers
       for (int odd : odds) { // Loop through each number in the odds ArrayList and print it
           System.out.print(odd + " "); // Print each odd number followed by a space so that they are not combined together
       }
   }
}

/* Screen Dump


Test Case 1:
EVEN: 10 88 86 54 26 36 22 36 98 2 8 
ODD: 93 1 33 91 37 17 67 97 69 35 53 93 65 53 



Test Case 2:
EVEN: 30 26 84 54 28 54 60 6 78 72 50 0 78 40 80 98 46 0 
ODD: 73 19 99 39 23 85 39 



*/
    	