/*

Program: addcoins_Mastery.java          Date: October 28, 2024

Purpose: An Add Coins application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays their total dollar amount. 
Application includes a method.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class addcoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will calculate the total amount of money your pennies, nickels, dimes, and quarters are worth. ");
        
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        String totalAmount = getDollarAmount(pennies, nickels, dimes, quarters);
        System.out.println("Total dollar amount: " + totalAmount);

    }

    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        // Calculate the total in cents
    
double totalamount = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25);
        // Convert to dollars and format the result

        return String.format("$%.2f", totalamount);
    }
}

/* Screen Dump


Test Case 1:
This program will calculate the total amount of money your pennies, nickels, dimes, and quarters are worth. 
Enter the number of pennies: 24
Enter the number of nickels: 25
Enter the number of dimes: 24
Enter the number of quarters: 25
Total dollar amount: $10.14

Test Case 2:
This program will calculate the total amount of money your pennies, nickels, dimes, and quarters are worth. 
Enter the number of pennies: 5
Enter the number of nickels: 4
Enter the number of dimes: 0
Enter the number of quarters: 3
Total dollar amount: $1.00

Test Case 3
This program will calculate the total amount of money your pennies, nickels, dimes, and quarters are worth. 
Enter the number of pennies: 30
Enter the number of nickels: 34
Enter the number of dimes: 33
Enter the number of quarters: 3
Total dollar amount: $6.05


 
 */
