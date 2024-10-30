/*

Program: primenumbers_Mastery.java          Date: October 28, 2024

Purpose: A prime number application that prompts the user for a number and then displays a 
message indicating whether the number is prime or not. Application uses methods.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class primenumbers {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Prompt the user to enter a number they want to know is prime
	        System.out.print("Enter a number you want to know is prime or not: ");
	        int number = input.nextInt();

	        // Call the isPrime method to check if the number is prime
	        boolean primecheck = isPrime(number);

	        // Output the result based on primecheck
	        System.out.println(number + (primecheck ? " is a prime number." : " is not a prime number."));
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	        // Handle edge cases
	        if (number <= 1) return false; // 0 and 1 are not prime numbers

	        // Check for factors from 2 to the square root of num
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false; // Found a divisor, so num is not prime
	            }
	        }
	        return true; // No divisors found, num is prime
	    }
	}

/* Screen Dump


Test Case 1:
Enter a number you want to know is prime or not: 7
7 is a prime number.

Test Case 2:
Enter a number you want to know is prime or not: -1
-1 is not a prime number.

Test Case 3
Enter a number you want to know is prime or not: 152
152 is not a prime number.


 
 */
