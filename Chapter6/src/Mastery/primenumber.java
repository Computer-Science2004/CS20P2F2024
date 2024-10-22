package Mastery;

import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number they want to know is prime
        System.out.print("Enter a number you want to know is prime or not: ");
        int number = input.nextInt();

        // Call the isPrime method to check if the number is prime
        boolean primecheck = isPrime(number);

        // Output the result based on the primecheck
        System.out.println(number + (primecheck ? " is a prime number." : " is not a prime number."));
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) return false; // 0 and 1 are not prime numbers

        // Check for factors from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, so num is not prime
            }
        }
        return true; // No divisors found, num is prime
    }
}
