package Skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		//values of each numerical place
        int tens = 0;
        int ones = 0;
        
        
        //prompt for two digit number
		System.out.print("Enter a 2 digit number: ");
        int number = userInput.nextInt();
		
        
		tens = (number / 10);
		System.out.printf("Tens place digit: " + tens);

		
		ones = number - (tens * 10);
		System.out.printf("\nOnes place digit: " + ones);
				
	}
	
}
		
