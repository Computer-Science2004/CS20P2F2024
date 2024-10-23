package Mastery;

import java.util.Scanner;

public class addcoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will cacluate the total amount of money your pennies, nickels, dimes, and quarters are worth. ");
        
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
