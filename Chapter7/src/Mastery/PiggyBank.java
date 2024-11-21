package Mastery;
public class PiggyBank {
	
	   private int pennies = 0; // Declare pennies variable (initialize as 0)
	   private int nickels = 0; // Declare nickels variable (initialize as 0)
	   private int dimes = 0; // Declare dimes variable (initialize as 0)
	   private int quarters = 0; // Declare quarters variable (initialize as 0)
	   // Options method takes in the parameter choice (0-6) from MySavings (Options is public so that MySavings can access it)
	   public String Options(int choice) {
		   
	       switch (choice) { // Switch statement that uses the passed parameter choice to execute 1 of the 7 options
	      
	           case 1: // Calculate the total amount (user selects choice 1)
	               double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25; /* Multiplies the amount of
	               a coin type by its corresponding value (does this for each individual coin), and then adds them for the total value
	               */
	               return String.format("Total amount in piggy bank: $%.2f", total); /* Returns sentence with the
	               formatted (too 2 decimal places) total amount in the user's bank
	               */
	               
	           case 2:// Add a penny (user selects choice 2)
	               pennies++; // Adds a penny to the penny variable
	               return "Added a penny."; // Return message to confirm the user's choice was executed
	               
	           case 3: // Add a nickel (user selects choice 3)
	               nickels++; // Adds a nickel to the nickel variable
	               return "Added a nickel."; // Return message to confirm the user's choice was executed
	               
	           case 4: // Add a dime (user selects choice 4)
	               dimes++; // Adds a dime to the dime variable
	               return "Added a dime."; // Return message to confirm the user's choice was executed
	               
	           case 5: // Add a quarter (user selects choice 5)
	               quarters++; // Adds a quarter to the quarter variable
	               return "Added a quarter."; // Return message to confirm the user's choice was executed
	               
	           case 6: // Removes all of the coins from the user's bank (user selects choice 6)
	               pennies = 0; // sets pennies variable equal to 0
	               nickels = 0; // sets nickels variable equal to 0
	               dimes = 0; // sets dimes variable equal to 0
	               quarters = 0; // sets quarters variable equal to 0
	               return "All coins have been removed from your piggy bank.";
	               // Return message to confirm the user's choice was executed
	               
	           case 0: // Stops the program (this is done in MySavings)
	               return "Exiting your bank account..."; // Return message to confirm the user's choice was executed
	               
	           default: // If a number 0-6 wasn't selected (for invalid options)
	               return "Invalid choice. Please enter a number from the menu options.";
	               // Return message to tell the user to re-enter a valid choice
	       } // Closes switch statement
	   } // Closes the public Options method
	} // Closes public class PiggyBank

