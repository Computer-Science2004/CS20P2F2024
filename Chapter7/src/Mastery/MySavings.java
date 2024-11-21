/*

Program: MySavings_Mastery.java          Date: November 14, 2024

Purpose: A MySavings application that displays a menu of choices for entering pennies, nickels, dimes, and quarters
into a piggy bank and the prompts the user to make a selection. The MySavings application includes a PiggyBank object
that can add coins to the piggy bank, remove coins, and return the total amount in the bank.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner; // Import the Scanner class to take in the user's input
public class MySavings { // Declare the MySavings class as public so that the PiggyBank class can access it
	
   public static void main(String[] args) { // Starting the public static void main method
   	
       PiggyBank piggyBank = new PiggyBank(); // Create the PiggyBank object (allows us to send information back and forth between classes)
      
       Scanner scanner = new Scanner(System.in); // Create a scanner Object to read the user's input (I named my object scanner)
      
       int choice; // Declare the integer variable choice
       System.out.println("Welcome to Hielan's Bank!"); // Print the initial welcome message
       // Begin the do-while loop
       do {
           // Display the menu of options (0-6)
           System.out.println("\nMenu:"); // Indicates that this is the menu to the user
          
           System.out.println("1. Show total in bank"); // Option (1) to show the user's total money in their bank account
           System.out.println("2. Add a penny"); // Option (2) to add a penny to the user's bank account
           System.out.println("3. Add a nickel"); // Option (3) to add a nickel to the user's bank account
           System.out.println("4. Add a dime"); // Option (4) to add a dime to the user's bank account
           System.out.println("5. Add a quarter"); // Option (5) to add a quarter to the user's bank account
           System.out.println("6. Remove all coins"); // Option (6) to remove all of the coins from the user's bank account
           System.out.println("0. Quit"); // // Option (0) quits the bank (user is done using Hielan's Bank
           System.out.print("Enter your choice: "); // Prompts the user to make a choice
           choice = scanner.nextInt(); /* Saves their input as a variable called choice (note: the Scanner objects name has
           to match here, hence why I put scanner.nextInt)
           */
           // Call Options method with the user's choice
           System.out.println(piggyBank.Options(choice)); /* This line of code sends the user's choice (0-6) to the PiggyBank
           class, which then returns an answer from the method Options based on the user's choice (this answer gets printed
           for the user to see) (gets results from the PiggyBank object)
           */
       } while (choice != 0); // While the user's choice doesn't equal (0) (quit) the program will continue to loop
       System.out.println("Thank you for using Hielan's Bank!"); // If the user's option equals (0) display a farewell message
   } // close main method
} // close the public class MySavings


/* Screen Dump


Test Case 1:

Welcome to Hielan's Bank!

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 2
Added a penny.

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 3
Added a nickel.

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 1
Total amount in piggy bank: $0.06

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 0
Exiting your bank account...
Thank you for using Hielan's Bank!



Test Case 2:

Welcome to Hielan's Bank!

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 2
Added a penny.

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 6
All coins have been removed from your piggy bank.

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 1
Total amount in piggy bank: $0.00

Menu:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Remove all coins
0. Quit
Enter your choice: 0
Exiting your bank account...
Thank you for using Hielan's Bank!




 
 */
