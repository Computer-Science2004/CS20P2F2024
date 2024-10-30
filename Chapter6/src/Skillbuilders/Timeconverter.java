package Skillbuilders;

import java.util.Scanner;

public class Timeconverter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Select a unit conversion (enter the number that correlates to your conversion):");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");

        int choice = scanner.nextInt();

      
        System.out.print("Enter value to convert: ");
        double input = scanner.nextDouble();
        double result = getConversionNum(choice, input);

      
        System.out.printf("The converted value is: %.2f\n", result);
    }

   
    public static double getConversionNum(int choice, double value) {
        switch (choice) {
            case 1:
                return value * 60;       
            case 2:
                return value * 24;       
            case 3:
                return value / 60;      
            case 4:
                return value / 24;      
            default:
                System.out.println("You did not select one of the four conversions.");
                return 0;
        }
    }
}

