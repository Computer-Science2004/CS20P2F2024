/*

Program: EvensAndOdds_Mastery.java          Date: December 9, 2024

Purpose: A Palindrome application that prompts the user for a string and then displays a message indicating whether or not the string is a palindrome.
A palindrome is a word or phrase that is spelled the same backwards and forwards. For example, "mom" is a palindrome, as well as "kayak" and "Never even odd or even".



School: CHHS
Course: Computer Science 20
 
*/

package Mastery; // Package name is Mastery

import java.util.Scanner; // Import the Scanner class to take in the user's input

public class Palindrome { // public class name Palindrome
	
   public static void main(String args[]) { // Starting the public static void main method
	  
	   Scanner scanner = new Scanner(System.in); // Create a scanner Object to read the user's input (I named my object scanner)

	   System.out.println("Enter a word to check if it is a palindrome:"); // Prompt the user to enter a word they want to know is a palindrome or not
	   String palindromeCheck = scanner.nextLine(); /* Saves their input as a variable called palindromeCheck (note: the Scanner objects name has
       to match here, hence why I put scanner.nextLine)
       */
	   
	   palindromeCheck = palindromeCheck.toLowerCase(); // Switch the input to lower case so there is no error when checking (explained more in reflection log)

	   char[] charArray = palindromeCheck.toCharArray(); /* Turns the input into a character array (Char) so that you can compare the individual
	   letters against each other to see if it is a palindrome (all reversed letters would be in the same place as original if it is a palindrome)
	   (explained more in reflection log)
	   */
	   
	   String reversed = ""; // Initializing the String variable reversed this will be to check against the original 
	   for (int i = charArray.length - 1; i >= 0; i--) { /* Breaks down the String inputed, goes through each letter (right to left), 
	   and then moves onto the next letter (as long as i >= 0 because 0 is the last letter it needs to check)
	   (explained more in my reflection log)
	   */
	       reversed += charArray[i]; // The variable reversed previously initialized as "" is now equal to each of these individual character (letters) (explained more in reflection log)
	   } // Close the part of the for loop that adds characters to the variable reversed

	   // Comparing Strings
	   if (palindromeCheck.equals(reversed)) { // Checks if the input reversed is equal to (the same as) the original input
		    System.out.println("The entered word is a palindrome."); // If it is the same then "The entered word is a palindrome." will be printed
	   } else { // For if the reversed input does NOT equal the original input
		    System.out.println("The entered word is NOT a palindrome."); // If it is NOT the same then "The entered word is a NOT palindrome." will be printed
	   } // close the else statement (end of if-else statement)

	   scanner.close(); // This closes the file that the scanner was reading (more on this in my reflection log)

   } // close main method
} // close the public class Palindrome

/* Screen Dump


Test Case 1:

Enter a word to check if it is a palindrome:
kayak
The entered word is a palindrome.

Test Case 2:

Enter a word to check if it is a palindrome:
hi
The entered word is not a palindrome.


*/