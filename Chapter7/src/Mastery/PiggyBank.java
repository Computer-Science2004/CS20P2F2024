package Mastery;

public class PiggyBank {
    // Variables to store the count of each coin type
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    // Constructor initializes the coin counts to zero
    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    // Method to add a penny (increment penny count)
    public void addPenny() {
        pennies++;
    }

    // Method to add a nickel (increment nickel count)
    public void addNickel() {
        nickels++;
    }

    // Method to add a dime (increment dime count)
    public void addDime() {
        dimes++;
    }


    // Method to add a quarter (increment quarter
    public void addQuarter() {
        quarters++;
    }
    
 // Method to add a quarter (increment quarter
    public static void clear() {
        PiggyBank.clear();
    }
    
    public void getTotal() {
        totalvalue = (pennies + dimes + nickels + quarters)();
    }
}
