package Mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geussinggame {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int randomnum = (int)(20 * Math.random() + 1); //random number generator
            System.out.println("Guess a number between 1 and 20: "); //prompt user

            int answer = 0; //initialize the user's guess

            //loop until the user guesses the correct number
            while (answer != randomnum) {
                answer = input.nextInt(); 

                if (answer == randomnum) { //make if statement for winning
                    System.out.println("Computer's Number: " + randomnum);
                    System.out.println("Player's Number: " + answer);
                    System.out.println("You won!");
                } else { //else statement for losing
                    System.out.println("Player's Number: " + answer);
                    System.out.println("Try again: ");
                }
            }

        }
    }