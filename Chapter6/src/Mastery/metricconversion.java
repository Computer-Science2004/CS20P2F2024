/*

Program: metricconversion_Mastery.java          Date: October 28, 2024

Purpose: A Metric Conversion Application that displays a menu of conversion choices and then prompts the user to choose a conversion
Conversion choices include inches to centimeters, feet to centimeters, yards to meters, miles to kilometers, and vice versa. Application uses methods.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class metricconversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu options for conversions that the user can choose from
        System.out.println("Select a unit conversion (enter the number that correlates to your conversion):");
        System.out.println("1. Centimeters to Inches");
        System.out.println("2. Inches to Centimeters");
        System.out.println("3. Feet to Centimeters");
        System.out.println("4. Centimeters to Feet");
        System.out.println("5. Yards to Meters");
        System.out.println("6. Meters to Yards");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");

        int choice = scanner.nextInt(); // Number chosen is the switch case that is used

      
        System.out.print("Enter value to convert: ");
        double input = scanner.nextDouble(); // The number the user wants to convert
    
        double answer = getConversionNum(choice, input); // result = what you get from getConversionNum using choice and input

        // Prints the result of the conversion from the getConversionNum method
        System.out.printf("The value converted is: %.2f\n", answer);
    }

    // Method that does the conversion based on the user's choice
    public static double getConversionNum(int choice, double value) { // parameters begin passed are choice and value
       
    	switch (choice) {
            case 1:
                return value * 0.393701; // Centimeters to Inches returning this value
            case 2:
                return value * 2.54;     // Inches to Centimeters returning this value
            case 3:
                return value * 30.48;    // Feet to Centimeters returning this value
            case 4:
                return value * 0.0328084; // Centimeters to Feet returning this value
            case 5:
                return value * 0.9144;   // Yards to Meters returning this value
            case 6:
                return value * 1.09361;  // Meters to Yards returning this value
            case 7:
                return value * 1.60934;  // Miles to Kilometers returning this value
            case 8:
                return value * 0.621371; // Kilometers to Miles returning this value
            default:
                return 0; // In case the user doesn't select one of the 8 conversions
        }
    }
}


/* Screen Dump


Test Case 1:
Select a unit conversion (enter the number that correlates to your conversion):
1. Centimeters to Inches
2. Inches to Centimeters
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
7
Enter value to convert: 24
The value converted is: 38.62

Test Case 2:
Select a unit conversion (enter the number that correlates to your conversion):
1. Centimeters to Inches
2. Inches to Centimeters
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
1
Enter value to convert: 23
The value converted is: 9.06

Test Case 3
Select a unit conversion (enter the number that correlates to your conversion):
1. Centimeters to Inches
2. Inches to Centimeters
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
4
Enter value to convert: 65
The value converted is: 2.13


 
 */