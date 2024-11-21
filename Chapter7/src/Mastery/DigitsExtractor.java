/*

Program: DigitsExtractor_Mastery.java          Date: November 15, 2024

Purpose: A DigitExtractor application that prompts the user for an integer and then displays the ones, tens, and hundreds digit of the number. 
The DigitsExtractor application includes a Num object that can return the ones digit, tens digit, hundreds digit, and the whole number.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner; // Import the Scanner class to take in the user's input
public class DigitsExtractor { // Declare the DigitsExtractor class as public so that the Num class can access it
	
public static void main(String[] args) { // Starting the public static void main method
	
	 Num num = new Num();// Create the Num object (allows us to send information back and forth between classes)
	
    Scanner scanner = new Scanner(System.in); // Create a scanner Object to read the user's input (I named my object scanner)
   
    System.out.print("Enter an integer: "); // Prompt the user to enter an integer before the loop (*only 1 number*)
    int number = scanner.nextInt(); // Save their input in the variable number (Scanner object name should match here)
    int choice; // Declare the integer variable choice
    // Begin the do-while loop
    do {
   	// Display the menu of options (0-4)
        System.out.println("\nChoose an option:"); // Prompt the user to choose one of the five options
        System.out.println("1. Whole number"); // // Option (1) show the whole number
        System.out.println("2. Ones place");   // Option (2) show the ones place
        System.out.println("3. Tens place");   // Option (3) show the tens place
        System.out.println("4. Hundreds place"); // Option (4) show the hundreds place
        System.out.println("0. Quit");        // Option (0) quit the DigitsExtractor program (user is done using the program)
        System.out.print("Enter your choice: "); // Prompts the user to make a choice
        choice = scanner.nextInt(); // Saves their input as a variable called choice (Scanner object name should match here)
        // Call Options method with the user's number and choice (results of the option they chose)
        System.out.println(num.Options(number, choice)); /* This line of code sends the user's choice (0-4) to the Num
        class, which then returns an answer from the method Options based on the user's choice (this answer gets printed
        for the user to see) (gets results from the Num object)
        */
    } while (choice != 0); // While the user's choice doesn't equal (0) (quit) the program will continue to loop
  } // Close the main method
} // Close the public class DigitsExtractor
// include test case of entering a number with two-digits and asking for the hundreds place

/* Screen Dump


Test Case 1:

Enter an integer: 2546

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 4
Hundreds place: 5

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 2
Ones place: 6

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 0
Exiting DigitsExtractor...


Test Case 2:

Enter an integer: 23

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 4
Hundreds place: 0

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 1
Whole number: 23

Choose an option:
1. Whole number
2. Ones place
3. Tens place
4. Hundreds place
0. Quit
Enter your choice: 0
Exiting DigitsExtractor...




*/

