/*

Program: EvensAndOdds_Mastery.java          Date: December 9, 2024

Purpose: A Palindrome application that prompts the user for a string and then displays a message indicating whether or not the string is a palindrome.
A palindrome is a word or phrase that is spelled the same backwards and forwards. For example, "mom" is a palindrome, as well as "kayak" and "Never even odd or even".



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the string to be checked to see if it's a palindrome.");
	   String s = sc.next();
	   char[] arr = s.toCharArray();
	   int n = arr.length;

	   // Construct reversed char[]
	   char[] rev = new char[n];
	   for (int i = 0; i < arr.length; i++) {
	       rev[i] = arr[n - i - 1];
	   }
	   String reversedString = new String(rev);

	   if (s.equals(reversedString)) {
	       System.out.println("It is a palindrome");
	   }
	   else {
	       System.out.println("It is not a palindrome");
	   }
   }
}

/* Screen Dump


Test Case 1:




Test Case 2:




*/