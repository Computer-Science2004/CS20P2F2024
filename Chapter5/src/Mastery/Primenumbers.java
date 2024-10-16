/*

Program: Primenumbers_Mastery.java          Date: October 1, 2024

Purpose: A prime number application that prompts the user for a number and then displays a 
message indicating whether the number is prime or not.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primenumbers {

  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    //prompt the user to enter a number they want to know is prime
    System.out.print("Enter a number you want to know is prime or not: ");
    int number = input.nextInt();

    //set primecheck to true
    boolean primecheck = true;

    // Check if their is a remainder for dividing by numbers from 2 to number-1
    for (int i = 2; i < number && primecheck; i++) {
      //modulo operator to check if there is any divisor
      primecheck = (number % i!= 0);
    }

    //output the result based on the primecheck ? is like an if else-statement
    System.out.println(number + (primecheck ? " is a prime number." : " is not a prime number."));

  
  }
}

/* Screen Dump
 

Test Case 1:
Enter a number you want to know is prime or not: 24
24 is not a prime number.

Test Case 2:
Enter a number you want to know is prime or not: 151
151 is a prime number.

Test Case 3
Enter a number you want to know is prime or not: 5466
5466 is not a prime number.

 
 */