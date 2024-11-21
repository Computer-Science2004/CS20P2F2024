package Mastery;

import java.util.Scanner; // Import the Scanner class to take in the user's input

public class LunchOrder { // Declare the LunchOrder class as public so that the Food class can access it
	
   public static void main(String[] args) { // Starting the public static void main method
   	
	   Food food = new Food(); // Create the food object (allows us to send information back and forth between classes)
	   
       Scanner scanner = new Scanner(System.in); // Create a scanner Object to read the user's input (I named my object scanner)
      
       int numHamburgers, numSalads, numFries, numSodas; // Declare variables to hold the user's amount for each type of food
       
       int foodType; // Declare the variable foodType which will be used to indicate to the Food class which item/food it is on
       
       // Hamburgers
       foodType = 1; // Set foodType to 1 for hamburgers (this is the case in Food)
      
       System.out.print("Enter the number of hamburgers you would like: "); // Prompting the user for the number of hamburgers they want
       numHamburgers = scanner.nextInt(); // Store the number of hamburgers in int variable numHamburgers
       System.out.println("Hamburgers nutritional information (per item): " + food.NutritionalInfo(foodType));
       // Print the nutritional information for a hamburger that you get from the Food object/class
       
       // Salads
       foodType = 2; // Set foodType to 2 for salads (this is the case in Food)
      
       System.out.print("\nEnter the number of salads you would like: "); // Prompting the user for the number of salads they want
       numSalads = scanner.nextInt(); // Store the number of salads in int variable numSalads
       System.out.println("Salads nutritional information (per item): " + food.NutritionalInfo(foodType));
       // Print the nutritional information for a salad that you get from the Food object/class
      
       // French fries
       foodType = 3; // Set foodType to 3 for French fries (this is the case in Food)
      
       System.out.print("\nEnter the number of French fries you would like: "); // Prompting the user for the number of French fries they want
       numFries = scanner.nextInt(); // Store the number of French fries in int variable numFries
       System.out.println("French fries nutritional information (per item): " + food.NutritionalInfo(foodType));
       // Print the nutritional information for French fries that you get from the Food object/class
       
       // Soda's
       foodType = 4; // Set foodType to 4 for soda's (this is the case in Food)
       System.out.print("\nEnter the number of sodas you would like: "); // Prompting the user for the number of soda's they want
       numSodas = scanner.nextInt(); // Store the number of soda's as int variable numSodas
       System.out.println("Sodas nutritional information (per item): " + food.NutritionalInfo(foodType));
       // Print the nutritional information for soda's that you get from the Food object/class
      
       // Call the TotalPrice method from food to calculate the total cost of the user's lunch order
       double totalPrice = food.TotalPrice(numHamburgers, numSalads, numFries, numSodas);
       // Print the total price formatted to 2 decimal places (cents are in 2 decimal places not 1)
       System.out.printf("\nThe total price of your lunch order is: $%.2f\n", totalPrice);
       scanner.close(); // Close the scanner object to free up resources
   } // Close the main method
} // Close LunchOrder class


