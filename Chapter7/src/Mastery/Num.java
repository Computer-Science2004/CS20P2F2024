package Mastery;

//Num class is set to public so that DigitsExtractor can call on it and use its information
public class Num {
	/* Options method takes in the parameter's choice (0-4) and number user's number from DigitsExtractor
	(Options is public so that MySavings can access it)
	*/
 public String Options(int number, int choice) {
 	
  // Switch statement that uses the passed parameter choice to execute 1 of the 5 options
  switch (choice) {
      case 1: // Whole number (user selects choice 1)
          return "Whole number: " + number; // Returns a sentence plus the whole number that the user entered
         
      case 2: // Ones place (user selects choice 2)
          return "Ones place: " + Math.abs(number) % 10;
          // Returns a sentence plus the calculated ones place of the user's number
         
      case 3: // Tens place (user selects choice 3)
          return "Tens place: " + Math.abs(number / 10) % 10;
          // Returns a sentence plus the calculated tens place of the user's number
         
      case 4: // Hundreds place (user selects choice 4)
          return "Hundreds place: " + Math.abs(number / 100) % 10;
          // Returns a sentence plus the calculated hundreds place of the user's number
         
      case 0: // Stops the program (this is done in DigitsExtractor)
          return "Exiting DigitsExtractor..."; // Return message to confirm the user's choice was executed
         
      default: // If a number 0-4 wasn't selected (for invalid options)
          return "Invalid choice. Please enter a number from the menu options.";
          // Return message to tell the user to re-enter a valid choice
   } // Closes the switch statement
} // Closes Public method Options
} // Closes public class Num

