package Mastery;

import java.util.Scanner;

public class esixdigits {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		
		//values of each numerical place
		int hundreds = 0;
        int tens = 0;
        int ones = 0;
        
        
        //prompt for three digit number
		System.out.print("Enter a three-digit number: ");
        int number = userInput.nextInt();
		
		hundreds = (number / 100);
		System.out.printf("Hundreds place digit: " + hundreds);
        
		tens = (number - (hundreds * 100))/10;
		System.out.printf("\nTens place digit: " + tens);

		
		ones = (number - (tens*10) - (hundreds*100));
		System.out.printf("\nOnes place digit: " + ones);
				
	}
	
}
		