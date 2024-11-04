package Mastery;

import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for user input
        PiggyBank piggyBank = new PiggyBank(); // Create a new PiggyBank object
        int choice; // Variable to store the user's menu choice

        do {
            // Display menu options to the user
            System.out.println("\n---- My Savings Menu ----");
            System.out.println("1. Show total in bank");
            System.out.println("2. Add a penny");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of the bank");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt(); // Read user input for menu choice

            // Handle menu selection with a switch statement
            switch (choice) {
                case 1:
                    // Show total amount in the piggy bank
                    System.out.printf("Total amount in bank: $%.2f%n", piggyBank.getTotal());
                    break;
                case 2:
                    // Add a penny to the piggy bank
                    piggyBank.addPenny();
                    System.out.println("Penny added.");
                    break;
                case 3:
                    // Add a nickel to the piggy bank
                    piggyBank.addNickel();
                    System.out.println("Nickel added.");
                    break;
                case 4:
                    // Add a dime to the piggy bank
                    piggyBank.addDime();
                    System.out.println("Dime added.");
                    break;
                case 5:
                    // Add a quarter to the piggy bank
                    piggyBank.addQuarter();
                    System.out.println("Quarter added.");
                    break;
                case 6:
                    // Clear all coins from the piggy bank
                    piggyBank.clear();
                    System.out.println("All money removed from the bank.");
                    break;
                case 0:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 0); // Loop until the user chooses to exit

        scanner.close(); // Close the scanner to avoid resource leak
    }
}

