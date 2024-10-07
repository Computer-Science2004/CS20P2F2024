package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primenumbers {

  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a number
    System.out.print("Enter a number you want to know is prime or not: ");
    int number = input.nextInt();

    // Assume the number is prime unless proven otherwise
    boolean isPrime = true;

    // Check divisability for numbers from 2 to number-1
    for (int i = 2; i < number && isPrime; i++) {
      // Use modulo operator to check if there is any divisor
      isPrime = (number % i != 0);
    }

    // Output the result based on the isPrime flag ? is like an if else-statement
    System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));

  
  }
}

