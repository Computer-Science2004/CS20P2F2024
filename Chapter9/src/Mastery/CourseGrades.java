/*
Program: MySavings_Mastery.java          Date: December 13, 2024
Purpose: A CourseGrades application that simulates a grade book for a class with 12 students that each have 5 test scores.
The CourseGrades application uses a GradeBook class that has member variables grades, which is a two-dimensional array
of integers, and methods getGrades() for prompting the user for the test grades for each student, showGrades() that
displays the grades for the class, studentAvg() that has a student number parameter and then returns the average grade
for that student, and testAvg() that has a test number parameter that then returns the average for that test.
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner; // Import the Scanner class to take in the user's input
public class CourseGrades { // public class CourseGrades (public so GradeBook can access it)
   public static void main(String[] args) { // Starting the public static void main method
   	
       Scanner scanner = new Scanner(System.in);  // Create a scanner Object to read the user's input (I named my object scanner)
      
       GradeBook gradeBook = new GradeBook();  // Create the gradeBook object (allows us to send information back and forth between classes)
       // Welcome message
       System.out.println("Welcome to the CourseGrades Application!");
       int choice;  // Declaring a variable to store the user's menu choice
      
       do { // beginning do-while loop
           // Display the menu options for the user to select from
           System.out.println("\nSelect an option:"); // Prompt message
           System.out.println("1. Enter student grades"); // Enter student grades
           System.out.println("2. Show all grades"); // Show all students grades
           System.out.println("3. View student average"); // View a students average grade
           System.out.println("4. View test average"); // View a tests average grade
           System.out.println("5. Quit"); // Quit the program
           choice = scanner.nextInt();  // Get the user's menu option
           switch (choice) { // Beginning switch statement that uses the passed parameter choice
          
               case 1: // case 1
                   // Enter grades for a specific student
                   System.out.print("Enter student number (1-12): "); // Prompt message
                   int studentNumber = scanner.nextInt();  // Save input as variable studentNumber
                   gradeBook.getGrades(studentNumber);  /* Call the method getGrades() from GradeBook
                   so the user can enter grades for the student
                   */
                   break; // End case 1
               case 2: // case 2
                   // Show all students grades for the entire class
                   gradeBook.showGrades();  // Call the method showGrades() from GradeBook to display all grades
                   break; // End case 2
               case 3: // case 3
                   // View the average grade for a specific student
                   System.out.print("Enter student number (1-12): "); // Prompt message for the student the user wants to see the average of
                   studentNumber = scanner.nextInt();  // Make their input equal to the variable studentNumber
                   double studentAverage = gradeBook.studentAvg(studentNumber); 
                   // Calculate the average for the student using the studentAvg() method in GradeBook
                   if (studentAverage != -1) {  // If the student number is valid (doesn't =-1 which is an error message from GradeBook)
                   	System.out.printf("Student %d's average grade is: %.2f%n", studentNumber, studentAverage);
                       // Print the student and then there average to two decimal places
                   } // Close if statement
                   break; // End case 3
               case 4: // case 4
                   // View the average grade for a specific test
                   System.out.print("Enter test number (1-5): "); // Prompt message for the test the user wants to see the average of
                   int testNumber = scanner.nextInt();  // Make their input equal to the variable testNumber
                   double testAverage = gradeBook.testAvg(testNumber); 
                   // Calculate the average for the test using the testAvg() method in GradeBook
                   if (testAverage != -1) {  // If the student number is valid (doesn't =-1 which is an error message from GradeBook)
                   	System.out.printf("Average grade for Test %d: %.2f%n", testNumber, testAverage);
                       // Print the test and then its average rounded to to two decimal places
                   } // Close if statement
                   break; // End case 4
               case 5: // case 5
                   // Quit the program
                   System.out.println("Exiting the Grade Book Application. Thank you! =)"); // Informative message of indicating quitting
                   break; // End case 5
               default: // default case
                   // Handle invalid menu option input, this is for if -1 is returned from the studentAvg() method or the testAvg() method
                   System.out.println("Invalid option. Please try again."); // Error message
           } // Close switch statement
       } while (choice != 5);  // If the user selects the 'Quit' choice (5)
       scanner.close();  // Close the scanner (explained in reflection log)
   } // Close the main method
} // Close the public class CourseGrades

/* Screen Dump
 * 
Test Case 1:
Welcome to the CourseGrades Application!
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
1
Enter student number (1-12): 3
Enter grades for Student 3
Enter grade for Test 1: 10
Enter grade for Test 2: 76
Enter grade for Test 3: 56
Enter grade for Test 4: 45
Enter grade for Test 5: 67
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
2
Student | Test 1 | Test 2 | Test 3 | Test 4 | Test 5
----------------------------------------------------
Student 1 | 46 | 15 | 48 | 40 | 86 |
Student 2 | 55 | 87 | 47 | 76 | 15 |
Student 3 | 10 | 76 | 56 | 45 | 67 |
Student 4 | 18 | 63 | 64 | 98 | 28 |
Student 5 | 45 | 19 | 59 | 51 | 9 |
Student 6 | 41 | 22 | 54 | 21 | 4 |
Student 7 | 15 | 14 | 2 | 35 | 38 |
Student 8 | 67 | 22 | 17 | 29 | 68 |
Student 9 | 55 | 53 | 74 | 83 | 49 |
Student 10 | 89 | 49 | 9 | 79 | 89 |
Student 11 | 27 | 8 | 93 | 72 | 84 |
Student 12 | 35 | 97 | 21 | 22 | 51 |
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
5
Exiting the Grade Book Application. Thank you! =)

Test Case 2:
Welcome to the CourseGrades Application!
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
3
Enter student number (1-12): 4
Student 4's average grade is: 74.00
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
4
Enter test number (1-5): 5
Average grade for Test 5: 45.25
Select an option:
1. Enter student grades
2. Show all grades
3. View student average
4. View test average
5. Quit
5
Exiting the Grade Book Application. Thank you! =)
*/
