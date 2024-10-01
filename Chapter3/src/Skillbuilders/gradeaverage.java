package Skillbuilders;

import java.util.Scanner;

public class gradeaverage {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter your first grade(as an integer, round if needed): ");
		int grade1 = userInput.nextInt();
		
		System.out.print("Please enter your second grade(as an integer, round if needed): ");
		int grade2 = userInput.nextInt();

		grade1+=grade2;
		
		System.out.print("Please enter your third grade(as an integer, round if needed): ");
		int grade3 = userInput.nextInt();
		
		grade1+=grade3;
		
		System.out.print("Please enter your fourth grade(as an integer, round if needed): ");
		int grade4 = userInput.nextInt();
		
		grade1+=grade4;
		
		System.out.print("Please enter your fifth grade(as an integer, round if needed): ");
		int grade5 = userInput.nextInt();
		
		grade1+=grade5;
		
		int gradeaverage = (grade1*100) / 500;
		
		System.out.print("Your grade average as an integer rounded down is: "+ gradeaverage +"%");
				
	}
		
		
}
	
	
	
	