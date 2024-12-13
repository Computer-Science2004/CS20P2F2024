package Mastery;

public class GradeBook { // public class GradeBook (public so CourseGrades can access information)
	
   // Variables for the number of students and tests
   private int numStudents = 12;  // Number of students (12)
   private int numTests = 5;      // Number of tests (5)
   private int[][] grades;  // 2D (two dimensional) array to hold the grades of all students (rows) for all tests (columns)
   /* Constructor to initialize the grade book and generate random grades for the students tests
   (you can tell it's a constructor because it has the same name as the class explained more in reflection log)
    */
   public GradeBook() {
   	 // Initialize the grades array with 12 students and 5 tests (using the variables declared at the start)
       grades = new int[numStudents][numTests]; 
       randomGrades();  // Populate the grades array with random grades from the randomGrades method below
   }
  
  
   // Method to generate random grades for all students tests
   public void randomGrades() { // public void randomGrades() method
       // Loop through each student
       for (int i = 0; i < numStudents; i++) { // numStudents is 12 and since index is initialized as 0 the loop will stop after i = 11
           // Nested for loop to loop through each test for the current student
           for (int j = 0; j < numTests; j++) { // numTests is 5 so it loops to i = 4 because "j" is initialized as 0
               // Assign a random grade (between 0 and 100) for each test
               grades[i][j] = (int)(Math.random() * 101);  /* Math.random() method generates a number between 0 and 1
               (explained more in reflection log)
           	the number becomes the value of "j" what test user is on, for the "i" what student user is on
               */
           } // Close nested for loop
       } // Close for loop
   } // Close randomGrades() method
  
  
   // Method to allow the user to input grades for a specific student
   public void getGrades(int studentNumber) { // public void method getGrades() passed the parameter studentNumber
      
   	// Error check
       if (studentNumber < 1 || studentNumber > numStudents) { // If studentNumber is less than 1 or greater then numStudents(12)
           System.out.println("Invalid student number."); // Print an error message
           return;  // Exit the method (will lead to you going back to the menu options)
       } // Close if statement
       // Prompt the user to enter grades for the student they want
       System.out.println("Enter grades for Student " + studentNumber);
       // Loop through each test for the selected student (1-5)
       for (int i = 0; i < numTests; i++) {
       /* Initialize i = 0, runs as long as "i" is less the numTests (5) because "i" is initialized as 0 (0-4 = 5 tests)
       add 1 to move onto the next test
       */
           // Prompt the user for a test grade for the student
           System.out.print("Enter grade for Test " + (i + 1) + ": "); // i + 1 shows the test in base 1 (which is what the user is using)
           // Update the grade for this student and test (studentNumber -1 because the array is in base 0) (i is the test) (explained more in reflection log)
           grades[studentNumber - 1][i] = new java.util.Scanner(System.in).nextInt();  // Get user input for the grade
       } // Close for loop
   } // Close getGrades() method
  
  
   // Method to show all grades for the entire class in a chart (table) format
   public void showGrades() { // public void method showGrades()
       // Print a header row for the student and test columns
       System.out.println("Student | Test 1 | Test 2 | Test 3 | Test 4 | Test 5");
       System.out.println("----------------------------------------------------"); // Line to separate header and student/grades
       // Loop through each student to display their grades
       for (int i = 0; i < numStudents; i++) { /* Initialize i = 0, loop continues as long as i is less then
       numStudents (12) (I do this because the array and now index is in base 0 so 0-11 is 12 students), add 1
       to "i" to move onto the next student (row)
       */
           System.out.print("Student " + (i + 1) + " | ");  // Print the student number (row) (i + 1 to account for base 0)
           // Nested for loop to loop through each test for the current student
           for (int j = 0; j < numTests; j++) { /* Initialize j = 0, loop keeps running as long as "j" is less than numTests
           to account for base 0, add 1 to "j" to move onto the next test
           */
               System.out.print(grades[i][j] + " | ");  // Print each test grade for the current student (I use " | " to separate information
           } // Close nested for loop
           System.out.println();  // Print a space to move onto the next line for the next student
       } // Close for loop
   } // Close showGrades() method
  
  
   // Method to calculate and return the average grade for a specific student
   public double studentAvg(int studentNumber) { // public double method studentAvg() passed the parameter studentNumber
      
   	// Error check
       if (studentNumber < 1 || studentNumber > numStudents) { // If studentNumber is less than 1 or greater then numStudents(12)
           System.out.println("Invalid student number."); // Print an error message
           return -1;  // Return -1 to indicate an error
       } // Close if statement
       int total = 0;  // Variable to hold the sum of the student's grades (declared outside the for loop because there are multiple iterations)
       // Loop through all tests for the specified student
       for (int i = 0; i < numTests; i++) { /* Initialize i = 0, loop keeps running as long as "i" is less than numTests (50
       	to account for base 0, add 1 to "i" to move onto the next test
       	*/
           total += grades[studentNumber - 1][i];  // Add the grade for each test ("i") to the total variable
       } // Close the for loop
       // Return the students average by dividing the total test scores by the number of tests (5)
       return (double) total / numTests;
   } // CLose studentAvg() method
  
  
   // Method to calculate and return the average grade for a specific test
   public double testAvg(int testNumber) { // public double method testAvg() with passed parameter testNumber
      
   	// Error check
       if (testNumber < 1 || testNumber > numTests) { // If testNumber is less than 1 or greater then numTests(5)
           System.out.println("Invalid test number."); // Print error message
           return -1;  // Return -1 to indicate an error
       } // Close if statement
       int total = 0;  // Variable to hold the sum of all the students' grades for the specified test
       // Loop through all students to calculate the sum of the grades for the specified test
       for (int i = 0; i < numStudents; i++) { /* Initialized i = 0, loop keeps running as long as i is less than
       numStudents(12) to account for base 0, add 1 to "i" to move onto next students grades
       */
           total += grades[i][testNumber - 1];  // Access grades 2D array for the current student and test to add to the total variable
       } // Close for loop
       // Return the average to CourseGrades by dividing the total by the number of students (12)
       return (double) total / numStudents;
   } // Close testAvg() method
} // Close public class GradeBook
