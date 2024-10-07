package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geussinggame {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int randomnum = (int)(20 * Math.random() + 1);
            System.out.println("Enter a number between 1 and 20: ");

            int answer = 0; // Initialize the user's guess, talk about how you originally didn't have this here

            // Loop until the user guesses the correct number
            while (answer != randomnum) {
                answer = input.nextInt(); // write how you had this outside the loop first and it didn't work

                if (answer == randomnum) {
                    System.out.println("Computer's Number: " + randomnum);
                    System.out.println("Player's Number: " + answer);
                    System.out.println("You won!");
                } else {
                    System.out.println("Player's Number: " + answer);
                    System.out.println("Try again: ");
                }
            }

        }
    }