/*

Program: Groupassignment_Mastery.java          Date: October 1, 2024

Purpose: A group assignment application that prompts the user for their first and last 
name and then outputs a group based on the first letter of their last name.



School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class Groupassignment {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
                // prompt the user for their first name
                System.out.print("Enter your first name: ");
                String firstname = input.nextLine();

                // prompt the user for their last name
                System.out.print("Enter your last name: ");
                String lastname = input.nextLine();

                // get the first letter of the user's last name
                char firstletter = lastname.toUpperCase().charAt(0);

                // determine which group the user belongs to based on the last name 
                String group;
                if (firstletter >= 'A' && firstletter <= 'I') {
                    group = "Group 1";
                } else if (firstletter >= 'J' && firstletter <= 'S') {
                    group = "Group 2";
                } else if (firstletter >= 'T' && firstletter <= 'Z') {
                    group = "Group 3";
                } else {
                    group = "*No Group Please Enter A Valid Last Name*";
                }

                // display the user's group assignment number
                System.out.println(firstname + " " + lastname + " is assigned to " + group);


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