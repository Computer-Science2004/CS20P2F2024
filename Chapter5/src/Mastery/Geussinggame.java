/*

Program: GuessingGame_Mastery.java          Date: October 1, 2024

Purpose: A guessing game application that prompts the user to guess a randomly generated number between 1 and 20,
if they get it right then they win, but if they don't they get as many guesses as they need until they get it
right


School: CHHS
Course: Computer Science 20
 
*/



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

/* Screen Dump
 

Test Case 1:
Guess a number between 1 and 20: 
20
Player's Number: 20
Try again: 
19
Player's Number: 19
Try again: 
18
Computer's Number: 18
Player's Number: 18
You won!

Test Case 2:
Guess a number between 1 and 20: 
1
Player's Number: 1
Try again: 
2
Player's Number: 2
Try again: 
3
Player's Number: 3
Try again: 
4
Player's Number: 4
Try again: 
5
Player's Number: 5
Try again: 
6
Player's Number: 6
Try again: 
7
Player's Number: 7
Try again: 
8
Player's Number: 8
Try again: 
9
Computer's Number: 9
Player's Number: 9
You won!

 */