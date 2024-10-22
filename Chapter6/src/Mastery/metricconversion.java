/*

Program: Groupassignment_Mastery.java          Date: October 1, 2024

Purpose: A group assignment application that prompts the user for their first and last 
name and then outputs a group based on the first letter of their last name.



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

        int choice = scanner.nextInt();

        // Pick a conversion calculation and output based on the number selected
        switch (choice) {
            case 1: // is selection 1
                System.out.print("Enter centimeters: ");
                double cm = scanner.nextDouble();
                double inches = cm * 0.393701;
                System.out.printf("%.2f centimeters is %.2f inches.", cm, inches);
                break;
            case 2:
                System.out.print("Enter inches: ");
                inches = scanner.nextDouble();
                cm = inches * 2.54;
                System.out.printf("%.2f inches is %.2f centimeters.", inches, cm);
                break;
            case 3:
                System.out.print("Enter feet: ");
                double feet = scanner.nextDouble();
                cm = feet * 30.48;
                System.out.printf("%.2f feet is %.2f centimeters.", feet, cm);
                break;
            case 4:
                System.out.print("Enter centimeters: ");
                cm = scanner.nextDouble();
                feet = cm * 0.0328084;
                System.out.printf("%.2f centimeters is %.2f feet.", cm, feet);
                break;
            case 5:
                System.out.print("Enter yards: ");
                double yards = scanner.nextDouble();
                double meters = yards * 0.9144;
                System.out.printf("%.2f yards is %.2f meters.", yards, meters);
                break;
            case 6:
                System.out.print("Enter meters: ");
                meters = scanner.nextDouble();
                yards = meters * 1.09361;
                System.out.printf("%.2f meters is %.2f yards.", meters, yards);
                break;
            case 7:
                System.out.print("Enter miles: ");
                double miles = scanner.nextDouble();
                double kilometers = miles * 1.60934;
                System.out.printf("%.2f miles is %.2f kilometers.", miles, kilometers);
                break;
            case 8:
                System.out.print("Enter kilometers: ");
                kilometers = scanner.nextDouble();
                miles = kilometers * 0.621371;
                System.out.printf("%.2f kilometers is %.2f miles.", kilometers, miles);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

/* Screen Dump


Test Case 1:
Enter your first name: Hielan
Enter your last name: Lee-Tremblay
Hielan Lee-Tremblay is assigned to Group 2

Test Case 2:
Enter your first name: Ethan 
Enter your last name: Xavier
Ethan  Xavier is assigned to Group 3

Test Case 3
Enter your first name: Rose
Enter your last name: Annabell
Rose Annabell is assigned to Group 1


 
 */