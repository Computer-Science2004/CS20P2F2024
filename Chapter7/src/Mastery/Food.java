package Mastery;

public class Food { //Food class is set to public so that LunchOrder can call on it and use its information
	// NutritionalInfo method takes in the parameter foodType (1-4) from LunchOrder (Options is public so that LunchOrder can access it)
   public String NutritionalInfo(int foodType) {
  
       switch (foodType) { // Switch statement that uses the passed parameter foodType to execute 1 of the 4 options
           case 1: // Hamburger
               return "Hamburger: 9g of fat, 33g of carbs, and 1g of fiber."; // Returns nutritional info for a hamburger
           case 2: // Salad
               return "Salad: 1g of fat, 11g of carbs, and 5g of fiber."; // Returns nutritional info for a salad
           case 3: // French Fries
               return "French fries: 11g of fat, 36g of carbs, and 4g of fiber."; // Returns nutritional info for French fries
           case 4: // Soda
               return "Soda: 0g of fat, 38g of carbs, and 0g of fiber."; // Returns nutritional info for a soda
           default:
               return " "; // Empty return message to fill the default case doesn't actually do anything
       } // Close switch statement
   } // Close NutrtionInfo method
   
   // Method to calculate the total price based on the amount of each item the user ordered
   public double TotalPrice(int numHamburgers, int numSalads, int numFries, int numSodas) {
   	// public double method TotalPrice gets passed the int variables that are the amount of each item the user is ordering
      
   	double totalPrice = 0; // Declare a double totalPrice variable and initialize it as 0
       // Add the price for the hamburgers to the total ($1.85 per hamburger)
       totalPrice += numHamburgers * 1.85;
      
       // Add the price for the salads to the total ($2.00 per salad)
       totalPrice += numSalads * 2.00;
      
       // Add the price for the French fries to the total ($1.30 per serving)
       totalPrice += numFries * 1.30;
      
       // Add the price for the soda's to the total ($0.95 per soda)
       totalPrice += numSodas * 0.95;
      
       return totalPrice; // Return the total price after all of the calculations (every item is added)
   } // Close TotalPrice method
} // Close Public class food
